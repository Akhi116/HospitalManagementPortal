package com.fedex.hm.appointment_service.mapper;


import com.fedex.hm.appointment_service.dto.request.AppointmentRequestDto;
import com.fedex.hm.appointment_service.dto.response.AppointmentResponseDto;
import com.fedex.hm.appointment_service.model.Appointment;
import org.springframework.stereotype.Component;

@Component
public class DtoToEntityMapper {

    public Appointment ConvertToEntity(AppointmentRequestDto dto) {
        Appointment appointment = new Appointment();
        appointment.setPatientId(dto.getPatientId());
        appointment.setDoctorId(dto.getDoctorId());
        appointment.setAppointmentDate(dto.getAppointmentDate());
        appointment.setStartTime(dto.getStartTime());
        appointment.setEndTime(dto.getEndTime());
        appointment.setStatus(dto.getStatus());
        return appointment;
    }

    public AppointmentResponseDto ConvertToDto(Appointment appointment){
        AppointmentResponseDto dto = new AppointmentResponseDto();
        dto.setId(appointment.getId());
        dto.setPatientId(appointment.getPatientId());
        dto.setDoctorId(appointment.getDoctorId());
        dto.setAppointmentDate(appointment.getAppointmentDate());
        dto.setStartTime(appointment.getStartTime());
        dto.setEndTime(appointment.getEndTime());
        dto.setStatus(appointment.getStatus());
        return dto;
    }

}
