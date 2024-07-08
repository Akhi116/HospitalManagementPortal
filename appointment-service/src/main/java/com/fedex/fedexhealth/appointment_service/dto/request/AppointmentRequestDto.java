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

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    // Convert enum to String for JPA mapping
    public String getStatus() {
        return (status == null) ? null : status.name();
    }

    // Convert String to enum for JPA mapping


    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
}
