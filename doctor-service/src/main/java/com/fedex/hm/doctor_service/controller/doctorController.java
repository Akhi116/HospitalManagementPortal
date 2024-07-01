package com.fedex.hm.doctor_service.controller;


import com.fedex.hm.doctor_service.dto.requestDto.availabilityRequestDto;
import com.fedex.hm.doctor_service.dto.requestDto.requestDto;
import com.fedex.hm.doctor_service.dto.responseDto.availabilityResponseDto;
import com.fedex.hm.doctor_service.dto.responseDto.responseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.fedex.hm.doctor_service.service.doctorService;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/doctor")
public class doctorController {

    @Autowired
    private doctorService doctorService;

    @GetMapping
    public ResponseEntity<List<responseDto>> getAll(){
        List<responseDto> doctorEntities = doctorService.getAll();
        return ResponseEntity.ok(doctorEntities);
    }

    @PostMapping("/create")
    ResponseEntity<responseDto> createDoctor(@RequestBody requestDto dto){
        responseDto doctor = doctorService.saveDoctor(dto);
        return ResponseEntity.ok(doctor);
    }

    @GetMapping("/{id}")
    ResponseEntity<responseDto> getDoctorById(@PathVariable Long id){
        return ResponseEntity.ok(doctorService.getDoctorById(id));
    }

    @GetMapping("/specialization/{specialization}")
    ResponseEntity<List<responseDto>> getDoctorBySpecialization(@PathVariable String specialization){
        List<responseDto> doctorEntities = doctorService.getDoctorBySpecialization(specialization);
        return ResponseEntity.ok(doctorEntities);
    }

    @PutMapping("/update/{id}")
    ResponseEntity<responseDto> updateDoctor(@PathVariable Long id, @RequestBody requestDto dto){
        responseDto doctor = doctorService.updateDoctor(id,dto);
        return ResponseEntity.ok(doctor);
    }

    @PatchMapping("/update/{id}")
    ResponseEntity<responseDto> updateDoctorByFields(@PathVariable Long id, @RequestBody Map<String, Object> fields){
        responseDto doctor = doctorService.updateDoctorByFields(id,fields);
        return ResponseEntity.ok(doctor);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<String> deleteDoctor(@PathVariable Long id){
        doctorService.deleteDoctor(id);
        return ResponseEntity.ok("Deleted Successfully");
    }

    @PostMapping("/{id}/availability")
    ResponseEntity<availabilityResponseDto> saveAvailability
            (@PathVariable Long id,@RequestBody availabilityRequestDto dto)
    {
        availabilityResponseDto schedule = doctorService.saveAvailability(id,dto);
        return ResponseEntity.ok(schedule);
    }

    @GetMapping("/{doctorId}/availability")
    ResponseEntity<List<availabilityResponseDto>> getAvailabilityByDoctorId(@PathVariable Long doctorId){
        List<availabilityResponseDto> availabilityList = doctorService.getAvailabilityByDoctorId(doctorId);
        return ResponseEntity.ok(availabilityList);
    }

    @GetMapping("/{id}/availability/{date}")
    ResponseEntity<List<availabilityResponseDto>> getAvailabilityByDoctorIdAndDate
            (@PathVariable Long id,
             @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date
            ){
        List<availabilityResponseDto> availabilityList = doctorService.getAvailabilityByDoctorIdAndDate(id,date);
        return ResponseEntity.ok(availabilityList);
    }

    @DeleteMapping("/availability/{availabilityId}")
    ResponseEntity<String> deleteAvailability(@PathVariable Long availabilityId){
        doctorService.deleteAvailability(availabilityId);
        return ResponseEntity.ok("Deleted Successfully");
    }
}
