package com.fedex.hm.doctor_service.service;


import com.fedex.hm.doctor_service.dto.requestDto.availabilityRequestDto;
import com.fedex.hm.doctor_service.dto.requestDto.requestDto;
import com.fedex.hm.doctor_service.dto.responseDto.availabilityResponseDto;
import com.fedex.hm.doctor_service.dto.responseDto.responseDto;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;


public interface doctorService {

    responseDto saveDoctor(requestDto dto);

    List<responseDto> getAll();

    responseDto getDoctorById(Long id);

    List<responseDto> getDoctorBySpecialization(String specialization);

    responseDto updateDoctor(Long id, requestDto dto);

    responseDto updateDoctorByFields(Long id, Map<String, Object> dto);

    void deleteDoctor(Long id);

    List<availabilityResponseDto> getAvailabilityByDoctorId(Long doctorId);

    List<availabilityResponseDto> getAvailabilityByDoctorIdAndDate(Long doctorId, LocalDate date);

    availabilityResponseDto saveAvailability(Long doctorId, availabilityRequestDto availabilityDto);

    void deleteAvailability(Long doctorId, Long availabilityId);

}
