package com.fedex.hm.appointment_service.service;

import com.fedex.hm.appointment_service.dto.request.AppointmentRequestDto;
import com.fedex.hm.appointment_service.dto.response.AppointmentResponseDto;

import java.util.List;

public interface AppointmentService {

    AppointmentResponseDto saveAppointment(AppointmentRequestDto dto);

    List<AppointmentResponseDto> getAppointments();

    List<AppointmentResponseDto> GetAppointmentsByPatientId(Long id);

    List<AppointmentResponseDto> GetAppointmentsByDoctorId(Long id);

    AppointmentResponseDto UpdateAppointmentByDoctorId(Long id, AppointmentRequestDto dto);

}
