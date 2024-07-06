package com.fedex.hm.medical_service.model;

import jakarta.persistence.*;

@Entity
@Table(name = "medical_records")
public class medicalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "doctor_id")
    private Long doctorId;
    @Column(name = "patient_id")
    private Long patientId;
    @Column(name = "record_details")
    private String recordDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }



    public String getRecordDetails() {
        return recordDetails;
    }

    public void setRecordDetails(String recordDetails) {
        this.recordDetails = recordDetails;
    }
}
