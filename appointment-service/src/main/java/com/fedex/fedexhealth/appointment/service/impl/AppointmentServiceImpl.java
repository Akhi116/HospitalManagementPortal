package com.fedex.fedexhealth.appointment.service.impl;

import com.fedex.fedexhealth.appointment.dto.request.AppointmentRequestDto;
import com.fedex.fedexhealth.appointment.dto.response.AppointmentResponseDto;
import com.fedex.fedexhealth.appointment.entity.Appointment;
import com.fedex.fedexhealth.appointment.mapper.DtoToEntityMapper;
import com.fedex.fedexhealth.appointment.model.AppointmentStatus;
import com.fedex.fedexhealth.appointment.repository.AppointmentRepository;
import com.fedex.fedexhealth.appointment.service.AppointmentService;
import globalExceptions.customException.AppointmentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    DtoToEntityMapper mapper;

    @Autowired
    AppointmentRepository repository;

    @Override
    public AppointmentResponseDto saveAppointment(AppointmentRequestDto dto) {
        Appointment appointment = mapper.ConvertToEntity(dto);
        repository.save(appointment);
        return mapper.ConvertToDto(appointment);
    }

    @Override
    public List<AppointmentResponseDto> getAppointments() {
        List<Appointment> appointmentList = (List<Appointment>) repository.findAll();
        if(appointmentList.isEmpty()){
            throw new AppointmentNotFoundException("No Appointments Available ...!");
        }
        return appointmentList.stream().map(mapper::ConvertToDto).collect(Collectors.toList());
    }

    @Override
    public List<AppointmentResponseDto> GetAppointmentsByPatientId(Long id) {
        List<Appointment> appointmentList = repository.findByPatientId(id);
        return appointmentList.stream().map(mapper::ConvertToDto).collect(Collectors.toList());
    }

    @Override
    public List<AppointmentResponseDto> GetAppointmentsByDoctorId(Long id) {
        List<Appointment> appointmentList = repository.findByDoctorId(id);
        return appointmentList.stream().map(mapper::ConvertToDto).collect(Collectors.toList());
    }

    @Override
    public AppointmentResponseDto UpdateAppointmentByDoctorId(Long id, AppointmentRequestDto dto) {
        Appointment targetDto = repository.findById(id).orElseThrow(()-> new AppointmentNotFoundException("Appointment not found for doctor id: " + id));
        targetDto.setAppointmentDate(dto.getAppointmentDate());
        targetDto.setStatus(AppointmentStatus.RESCHEDULED);

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
}
