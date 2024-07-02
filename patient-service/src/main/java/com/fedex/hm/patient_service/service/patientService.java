package com.fedex.hm.patient_service.service;

import com.fedex.hm.patient_service.dto.requestDto;
import com.fedex.hm.patient_service.dto.responseDto;

import java.util.List;
import java.util.Map;

public interface patientService {

    responseDto savePatient(requestDto dto);

    responseDto getPatientById(Long id);

    List<responseDto> getPatientByName(String name);

    List<responseDto> getAll();

    responseDto updatePatient(Long id, requestDto dto);

    responseDto updatePatientByFields(Long id, Map<String, Object> field);

    void deletePatientById(Long id);
}
