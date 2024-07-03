package com.fedex.fedexhealth.appointment.dto.request;

import com.fedex.fedexhealth.appointment.model.AppointmentStatus;
import jakarta.persistence.Column;

import java.time.LocalDate;
import java.time.LocalTime;

public class AppointmentRequestDto {
    private Long patientId;

    private Long doctorId;

    private AppointmentStatus status = AppointmentStatus.PENDING;

    private LocalDate appointmentDate;

    private LocalTime startTime;

    private LocalTime endTime;

    public Long getPatientId() {
        return patientId;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
}
