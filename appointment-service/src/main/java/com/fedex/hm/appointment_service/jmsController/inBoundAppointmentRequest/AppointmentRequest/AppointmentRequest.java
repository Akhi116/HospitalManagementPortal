package com.fedex.hm.appointment_service.jmsController.inBoundAppointmentRequest.AppointmentRequest;

public class AppointmentRequest {
    private Long patientId;
    private Long doctorId;
    private AvailabilitySchedule availabilitySchedule;

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

    public AvailabilitySchedule getAvailabilitySchedule() {
        return availabilitySchedule;
    }

    public void setAvailabilitySchedule(AvailabilitySchedule availabilitySchedule) {
        this.availabilitySchedule = availabilitySchedule;
    }
}
