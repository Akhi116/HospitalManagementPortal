package com.fedex.hm.patient_service.mapper;


import com.fedex.hm.patient_service.dto.requestDto;
import com.fedex.hm.patient_service.dto.responseDto;
import com.fedex.hm.patient_service.model.Patient;
import org.springframework.stereotype.Component;

@Component
public class dtoToEntityMapper {
    public Patient toConvertEntity(requestDto dto){

        Patient patient = new Patient();

        patient.setName(dto.getName());
        patient.setGender(dto.getGender());
        patient.setEmail(dto.getEmail());
        patient.setPassword(dto.getPassword());
        patient.setAddress(dto.getAddress());
        patient.setContactNumber(dto.getContactNumber());
        patient.setDateOfBirth(dto.getDateOfBirth());

        return patient;
    }

    public responseDto toConvertDto(Patient patient){

        responseDto dto = new responseDto();

        dto.setId(patient.getId());
        dto.setName(patient.getName());
        dto.setEmail(patient.getEmail());
        dto.setPassword(patient.getPassword());
        dto.setGender(patient.getGender());
        dto.setContactNumber(patient.getContactNumber());
        dto.setDateOfBirth(patient.getDateOfBirth());
        dto.setAddress(patient.getAddress());

        return dto;
    }
}
