package com.fedex.fedexhealth.appointment.service;

import com.fedex.fedexhealth.appointment.dto.request.AppointmentRequestDto;
import com.fedex.fedexhealth.appointment.dto.response.AppointmentResponseDto;
import java.util.List;
import java.util.Map;

public interface AppointmentService {

    AppointmentResponseDto saveAppointment(AppointmentRequestDto dto);

    List<AppointmentResponseDto> getAppointments();

    List<AppointmentResponseDto> GetAppointmentsByPatientId(Long id);

    List<AppointmentResponseDto> GetAppointmentsByDoctorId(Long id);

    AppointmentResponseDto UpdateAppointment(Long id, AppointmentRequestDto dto);

    AppointmentResponseDto UpdateAppointmentStatus(Long id, Map<String, Object> fields);

}
