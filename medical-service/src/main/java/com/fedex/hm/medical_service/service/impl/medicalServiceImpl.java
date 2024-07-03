package com.fedex.hm.medical_service.service.impl;
import com.fedex.hm.medical_service.dto.requestDto.medicalRequestDto;
import com.fedex.hm.medical_service.dto.responseDto.medicalResponseDto;
import com.fedex.hm.medical_service.globalExceptions.customExceptions.recordNotFoundException;
import com.fedex.hm.medical_service.mapper.mapperdto.medicalMapper;
import com.fedex.hm.medical_service.model.medicalEntity;
import com.fedex.hm.medical_service.repository.medicalrecordsRepository;
import com.fedex.hm.medical_service.service.medicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service

public class medicalServiceImpl implements medicalService{
    @Autowired
    private medicalMapper mapper;
    @Autowired
    private medicalrecordsRepository repository;
    @Override
    public medicalResponseDto saveMedicalRecord(medicalRequestDto dto) {
       medicalEntity entity= mapper.convertToEntity(dto);
       repository.save(entity);
       return mapper.convertToDto(entity);


    }
    @Override
    public List<medicalResponseDto> getMedicalRecords(){
        List<medicalEntity> entityList=repository.findAll();
        if(entityList.isEmpty()){
            throw new recordNotFoundException("No records found..!!  ");
        }
        return entityList.stream().map(mapper::convertToDto).collect(Collectors.toList());

    }
    @Override
    public List<medicalResponseDto> getRecordById(Long id){
        List<medicalEntity> entityList=repository.findByPatientId(id);
        if(entityList.isEmpty()){
            throw new recordNotFoundException("No patient found with id "+id);
        }

        return entityList.stream().map(mapper::convertToDto).collect(Collectors.toList());

    }

}
