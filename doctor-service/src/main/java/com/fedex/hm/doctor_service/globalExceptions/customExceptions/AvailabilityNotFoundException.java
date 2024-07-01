package com.fedex.hm.doctor_service.globalExceptions.customExceptions;

public class AvailabilityNotFoundException extends RuntimeException{
    public AvailabilityNotFoundException(String message){
        super(message);
    }
}
