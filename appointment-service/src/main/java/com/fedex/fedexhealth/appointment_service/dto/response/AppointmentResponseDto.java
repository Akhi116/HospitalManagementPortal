package com.fedex.fedexhealth.appointment.dto.response;

import com.fedex.fedexhealth.appointment.model.AppointmentStatus;

import java.time.LocalDate;
import java.time.LocalTime;

public class AppointmentResponseDto {
    private Long id;
    private Long patientId;
    private Long doctorId;
    private LocalDate appointmentDate;
    private AppointmentStatus status;
    private LocalTime startTime;
    private LocalTime endTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public AppointmentStatus getStatus() {
        return status;
    }



    // Convert String to enum for JPA mapping
    public void setStatus(String status) {
        this.status = (status == null) ? null : AppointmentStatus.valueOf(status);
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
