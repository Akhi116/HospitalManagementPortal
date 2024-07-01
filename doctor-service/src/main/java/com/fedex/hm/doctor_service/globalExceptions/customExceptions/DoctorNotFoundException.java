package com.fedex.hm.doctor_service.globalExceptions.customExceptions;


public class DoctorNotFoundException extends RuntimeException{
    public DoctorNotFoundException(String message){
        super(message);
    }
}
