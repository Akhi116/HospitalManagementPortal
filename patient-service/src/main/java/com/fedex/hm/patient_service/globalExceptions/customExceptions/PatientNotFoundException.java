package com.fedex.hm.patient_service.globalExceptions.customExceptions;

public class PatientNotFoundException extends RuntimeException{

    public PatientNotFoundException(String message){
        super(message);
    }
}
