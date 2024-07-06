package com.fedex.hm.doctor_service.jmsController.outBoundMessage;

public class updateAvailabilityRequest {
    private Long doctorId;
    private AvailabilitySchedule availabilitySchedule;

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