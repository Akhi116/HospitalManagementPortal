package com.fedex.hm.doctor_service.service.impl;

import com.fedex.hm.doctor_service.dto.requestDto.availabilityRequestDto;
import com.fedex.hm.doctor_service.dto.requestDto.requestDto;
import com.fedex.hm.doctor_service.dto.responseDto.availabilityResponseDto;
import com.fedex.hm.doctor_service.dto.responseDto.responseDto;
import com.fedex.hm.doctor_service.globalExceptions.customExceptions.AvailabilityNotFoundException;
import com.fedex.hm.doctor_service.globalExceptions.customExceptions.DoctorNotFoundException;
import com.fedex.hm.doctor_service.mapper.DtoToEntityMapper;
import com.fedex.hm.doctor_service.model.AvailabilitySchedules;
import com.fedex.hm.doctor_service.model.Doctor;
import com.fedex.hm.doctor_service.repository.availabilityRepository;
import com.fedex.hm.doctor_service.repository.doctorRepository;
import com.fedex.hm.doctor_service.service.doctorService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class doctorServiceImpl implements doctorService {

    @Autowired
    private doctorRepository doctorRepository;

    @Autowired
    private availabilityRepository availabilityRepository;

    @Autowired
    private DtoToEntityMapper mapper;

    // Doctor Operations

    @Override
    public responseDto saveDoctor(requestDto dto) {
        Doctor doctor = mapper.convertToEntity(dto);
        doctorRepository.save(doctor);
        return mapper.convertToDto(doctor);
    }

    @Override
    public List<responseDto> getAll() {
        List<Doctor> doctorEntities = doctorRepository.findAll();

        if(doctorEntities.isEmpty()){
            throw new DoctorNotFoundException("No doctors found..!!  ");
        }
        return doctorEntities.stream().map(mapper::convertToDto).collect(Collectors.toList());
    }

    @Override
    public responseDto getDoctorById(Long id) {
        Doctor doctor = doctorRepository.findById(id).orElseThrow(()-> new DoctorNotFoundException("Doctor not found with id: " + id));
        return mapper.convertToDto(doctor);
    }

    @Override
    public List<responseDto> getDoctorBySpecialization(String specialization) {
        List<Doctor> doctors = doctorRepository.findBySpecialization(specialization);
        if(doctors.isEmpty()){
            throw new DoctorNotFoundException("Doctors not found with selected Specialization.");
        }
        return doctors.stream().map(mapper::convertToDto).collect(Collectors.toList());
    }

    @Override
    public responseDto updateDoctor(Long id, requestDto dto) {
        Doctor doctor = doctorRepository.findById(id).orElseThrow(()-> new DoctorNotFoundException("Doctor not found with id: " + id));

        doctor.setName(dto.getName());
        doctor.setSpecialization(dto.getSpecialization());
        doctor.setContactNumber(dto.getContactNumber());
        doctor.setEmail(dto.getEmail());

        doctorRepository.save(doctor);
        return mapper.convertToDto(doctor);
    }

    @Override
    public responseDto updateDoctorByFields(Long id, Map<String, Object> fields) {
        Optional<Doctor> doctor = doctorRepository.findById(id);

        if(doctor.isPresent()){
            fields.forEach((key,value) -> {
                Field field = ReflectionUtils.findField(Doctor.class, key);
                field.setAccessible(true);
                ReflectionUtils.setField(field, doctor.get(), value);
            });

            doctorRepository.save(doctor.get());
            return mapper.convertToDto(doctor.get());
        }

        throw new DoctorNotFoundException("Doctor not found with id: " + id);
    }

    @Override
    public void deleteDoctor(Long id) {
        Doctor doctor = doctorRepository.findById(id).orElseThrow(()-> new DoctorNotFoundException("Doctor not found with id: " + id));
        doctorRepository.deleteById(id);
    }

    // Schedule Operations

    @Override
    public List<availabilityResponseDto> getAvailabilityByDoctorId(Long doctorId) {
        List<AvailabilitySchedules> schedules = availabilityRepository.findByDoctorId(doctorId);
        if(schedules.isEmpty()) {
            throw new AvailabilityNotFoundException("No availability schedules found for doctor id: " + doctorId);
        }
        return schedules.stream().map(mapper::toAvailabilityResponseDto).collect(Collectors.toList());
    }

    @Override
    public List<availabilityResponseDto> getAvailabilityByDoctorIdAndDate(Long doctorId, LocalDate date) {
        List<AvailabilitySchedules> schedules = availabilityRepository.findByDoctorIdAndDate(doctorId,date);
        if(schedules.isEmpty()) {
            throw new AvailabilityNotFoundException("No availability schedules found for doctor id: " + doctorId + " on date " + date);
        }
        return schedules.stream().map(mapper::toAvailabilityResponseDto).collect(Collectors.toList());
    }

    @Override
    public availabilityResponseDto saveAvailability(Long doctorId, availabilityRequestDto availabilityDto) {
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow(()-> new DoctorNotFoundException("Doctor not found with id: " + doctorId));
        AvailabilitySchedules schedule = mapper.toAvailabilityEntity(availabilityDto);
        schedule.setDoctor(doctor);
        availabilityRepository.save(schedule);
        return mapper.toAvailabilityResponseDto(schedule);
    }

    @Override
    public void deleteAvailability(Long availabilityId) {
        AvailabilitySchedules schedule = availabilityRepository.findById(availabilityId).orElseThrow(()-> new AvailabilityNotFoundException("Availability schedules not found with id: " + availabilityId));
//        if(!schedule.getDoctor().getId().equals(doctorId)){
//            throw new IllegalArgumentException("Invalid Doctor ID");
//        }
        availabilityRepository.delete(schedule);
    }


}
