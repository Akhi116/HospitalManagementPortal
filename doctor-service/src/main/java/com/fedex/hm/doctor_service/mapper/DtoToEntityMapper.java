package com.fedex.hm.doctor_service.mapper;

import com.fedex.hm.doctor_service.dto.requestDto.availabilityRequestDto;
import com.fedex.hm.doctor_service.dto.responseDto.availabilityResponseDto;
import com.fedex.hm.doctor_service.dto.requestDto.requestDto;
import com.fedex.hm.doctor_service.dto.responseDto.responseDto;
import com.fedex.hm.doctor_service.model.AvailabilitySchedules;
import com.fedex.hm.doctor_service.model.Doctor;
import org.springframework.stereotype.Component;

@Component
public class DtoToEntityMapper {

    public Doctor convertToEntity(requestDto dto){
        Doctor doctor = new Doctor();
        doctor.setName(dto.getName());
        doctor.setSpecialization(dto.getSpecialization());
        doctor.setContactNumber(dto.getContactNumber());
        doctor.setEmail(dto.getEmail());
//        doctor.setAvailabilitySchedule(dto.getAvailabilitySchedule());
        return doctor;
    }

    public responseDto convertToDto(Doctor doctor) {
        responseDto dto = new responseDto();
        dto.setId(doctor.getId());
        dto.setName(doctor.getName());
        dto.setSpecialization(doctor.getSpecialization());
        dto.setContactNumber(doctor.getContactNumber());
        dto.setEmail(doctor.getEmail());
//        dto.setAvailabilitySchedule(doctor.getAvailabilitySchedule());
        return dto;
    }

    public AvailabilitySchedules toAvailabilityEntity(availabilityRequestDto dto){
        AvailabilitySchedules availability = new AvailabilitySchedules();
        availability.setDate(dto.getDate());
        availability.setDayOfWeek(dto.getDayOfWeek());
        availability.setStartTime(dto.getStartTime());
        availability.setEndTime(dto.getEndTime());

        return availability;
    }

    public availabilityResponseDto toAvailabilityResponseDto(AvailabilitySchedules availability){
        availabilityResponseDto dto = new availabilityResponseDto();
        dto.setId(availability.getId());
        dto.setDate(availability.getDate());
        dto.setDayOfWeek(availability.getDayOfWeek());
        dto.setStartTime(availability.getStartTime());
        dto.setEndTime(availability.getEndTime());
        return dto;
    }


}
