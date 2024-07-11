package com.fedex.fedexhealth.appointment.entity;

import com.fedex.fedexhealth.appointment.model.AppointmentStatus;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table( name = "Appointment" )

public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "patient_id")
    private Long patientId;

    @Column(name = "doctor_id")
    private Long doctorId;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private AppointmentStatus status;

    @Column(name = "appointment_date_time")
    private LocalDate appointmentDate;

    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_time")
    private LocalTime endTime;

    public Long getId() {
        return id;
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

    // Convert enum to String for JPA mapping
    public String getStatus() {
        return (status == null) ? null : status.name();
    }

    // Convert String to enum for JPA mapping
    public void setStatus(String status) {
        this.status = (status == null) ? null : AppointmentStatus.valueOf(status);
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
