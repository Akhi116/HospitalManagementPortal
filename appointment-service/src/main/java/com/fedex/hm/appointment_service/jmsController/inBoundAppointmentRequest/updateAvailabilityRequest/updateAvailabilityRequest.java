package com.fedex.hm.appointment_service.jmsController.inBoundAppointmentRequest.updateAvailabilityRequest;

import com.fedex.hm.appointment_service.jmsController.inBoundAppointmentRequest.AppointmentRequest.AvailabilitySchedule;

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
