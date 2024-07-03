package com.fedex.fedexhealth.appointment.service;

import com.fedex.fedexhealth.appointment.dto.request.AppointmentRequestDto;
import com.fedex.fedexhealth.appointment.dto.response.AppointmentResponseDto;
import java.util.List;

public interface AppointmentService {

    AppointmentResponseDto saveAppointment(AppointmentRequestDto dto);

    List<AppointmentResponseDto> getAppointments();

    List<AppointmentResponseDto> GetAppointmentsByPatientId(Long id);

    List<AppointmentResponseDto> GetAppointmentsByDoctorId(Long id);

    AppointmentResponseDto UpdateAppointmentByDoctorId(Long id);
}
