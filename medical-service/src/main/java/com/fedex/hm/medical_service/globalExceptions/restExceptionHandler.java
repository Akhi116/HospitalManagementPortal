package com.fedex.hm.medical_service.globalExceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.fedex.hm.medical_service.globalExceptions.customExceptions.*;

@RestControllerAdvice

public class restExceptionHandler {
    @ExceptionHandler(recordNotFoundException.class)
    public ResponseEntity<String> handleRecordNotFoundException(recordNotFoundException exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);

    }
}
