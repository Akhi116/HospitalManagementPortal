package com.fedex.hm.medical_service.service;
import com.fedex.hm.medical_service.dto.responseDto.medicalResponseDto;
import com.fedex.hm.medical_service.dto.requestDto.medicalRequestDto;

import java.util.List;

public interface medicalService {
    medicalResponseDto saveMedicalRecord(medicalRequestDto dto);
    List<medicalResponseDto> getMedicalRecords();
    List<medicalResponseDto> getRecordById(Long id);




}
