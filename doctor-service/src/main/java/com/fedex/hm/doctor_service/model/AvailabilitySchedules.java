package com.fedex.hm.doctor_service.model;

import jakarta.persistence.*;

@Entity
@Table(name = "availability_schedules")
public class AvailabilitySchedules {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
    @Column(name = "date")
    private String date;
    @Column(name = "slot_time")
    private String slotTime;

    @Column(name = "booked")
    private boolean isBooked;

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public Long getId(){
        return this.id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSlotTime() {
        return slotTime;
    }

    public void setSlotTime(String slotTime) {
        this.slotTime = slotTime;
    }
}



