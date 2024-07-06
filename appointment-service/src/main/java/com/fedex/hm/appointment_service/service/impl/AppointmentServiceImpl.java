package com.fedex.hm.appointment_service.service.impl;


import com.fedex.hm.appointment_service.dto.request.AppointmentRequestDto;
import com.fedex.hm.appointment_service.dto.response.AppointmentResponseDto;
import com.fedex.hm.appointment_service.globalExceptions.customException.AppointmentNotFoundException;
import com.fedex.hm.appointment_service.mapper.DtoToEntityMapper;
import com.fedex.hm.appointment_service.model.Appointment;
import com.fedex.hm.appointment_service.model.AppointmentStatus;
import com.fedex.hm.appointment_service.repository.AppointmentRepository;
import com.fedex.hm.appointment_service.service.AppointmentService;
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
        if (appointmentList.isEmpty()) {
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
        Appointment targetDto = repository.findById(id).orElseThrow(() -> new AppointmentNotFoundException("Appointment not found for doctor id: " + id));
        targetDto.setAppointmentDate(dto.getAppointmentDate());
        targetDto.setStatus(AppointmentStatus.RESCHEDULED);
        return mapper.ConvertToDto(targetDto);
    }
}
