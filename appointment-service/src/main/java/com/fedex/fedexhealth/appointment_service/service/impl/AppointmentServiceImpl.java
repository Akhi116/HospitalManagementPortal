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
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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
    public AppointmentResponseDto UpdateAppointment(Long id, AppointmentRequestDto dto) {
        Appointment targetDto = repository.findById(id).orElseThrow(()-> new AppointmentNotFoundException("Appointment not found ...!"));
        targetDto.setAppointmentDate(dto.getAppointmentDate());
        targetDto.setStatus("RESCHEDULED");
        targetDto.setStartTime(dto.getStartTime());
        targetDto.setEndTime(dto.getEndTime());
        repository.save(targetDto);
        return mapper.ConvertToDto(targetDto);
    }

    @Override
    public AppointmentResponseDto UpdateAppointmentStatus(Long id, Map<String, Object> fields) {
        Optional<Appointment> dto = repository.findById(id);
        if(dto.isPresent()) {
            Appointment appointment = dto.get();

            if (fields.containsKey("status")) {
                appointment.setStatus((String) fields.get("status"));
            }

            repository.save(appointment);
            return mapper.ConvertToDto(dto.get());
        }
        throw new AppointmentNotFoundException("Appointment not found ...!");
    }

}
