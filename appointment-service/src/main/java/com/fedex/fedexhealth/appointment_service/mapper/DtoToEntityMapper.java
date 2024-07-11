package com.fedex.fedexhealth.appointment.mapper;

import com.fedex.fedexhealth.appointment.dto.request.AppointmentRequestDto;
import com.fedex.fedexhealth.appointment.dto.response.AppointmentResponseDto;
import com.fedex.fedexhealth.appointment.entity.Appointment;
import org.springframework.stereotype.Component;

@Component
public class DtoToEntityMapper {

    public Appointment ConvertToEntity(AppointmentRequestDto dto) {
        Appointment appointment = new Appointment();
        appointment.setPatientId(dto.getPatientId());
        appointment.setDoctorId(dto.getDoctorId());
        appointment.setStatus(dto.getStatus());
        appointment.setAppointmentDate(dto.getAppointmentDate());
        appointment.setStartTime(dto.getStartTime());
        appointment.setEndTime(dto.getEndTime());
        return appointment;
    }

    public AppointmentResponseDto ConvertToDto(Appointment appointment){
        AppointmentResponseDto dto = new AppointmentResponseDto();
        dto.setId(appointment.getId());
        dto.setPatientId(appointment.getPatientId());
        dto.setDoctorId(appointment.getDoctorId());
        dto.setStatus(appointment.getStatus());
        dto.setAppointmentDate(appointment.getAppointmentDate());
        dto.setStartTime(appointment.getStartTime());
        dto.setEndTime(appointment.getEndTime());
        System.out.println(dto.toString());
        return dto;
    }
}
