package com.fedex.hm.medical_service.mapper.mapperdto;
import com.fedex.hm.medical_service.dto.responseDto.medicalResponseDto;
import com.fedex.hm.medical_service.model.medicalEntity;
import com.fedex.hm.medical_service.dto.requestDto.medicalRequestDto;
import org.springframework.stereotype.Component;

@Component

public class medicalMapper {
    public medicalEntity convertToEntity(medicalRequestDto dto){
        medicalEntity entity=new medicalEntity();
        entity.setDoctorId(dto.getDoctorId());
        entity.setPatientId(dto.getPatientId());
        entity.setRecordDetails(dto.getRecordDetails());
        return entity;


    }
    public medicalResponseDto convertToDto(medicalEntity entity){
        medicalResponseDto responseDto=new medicalResponseDto();
        responseDto.setId(entity.getId());
        responseDto.setDoctorId(entity.getDoctorId());
        responseDto.setPatientId(entity.getPatientId());
        responseDto.setRecordDetails(entity.getRecordDetails());
        return responseDto;


    }

}
