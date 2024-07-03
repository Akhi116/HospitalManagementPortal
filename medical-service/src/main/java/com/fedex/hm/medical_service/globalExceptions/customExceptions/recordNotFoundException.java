package com.fedex.hm.medical_service.globalExceptions.customExceptions;

public class recordNotFoundException extends RuntimeException {
    public recordNotFoundException(String message){
        super(message);
    }

}
