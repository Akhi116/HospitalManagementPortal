package com.fedex.hm.appointment_service.globalExceptions.customException;

public class AppointmentNotFoundException extends RuntimeException {
    public AppointmentNotFoundException(String message){
        super(message);
    }
}
