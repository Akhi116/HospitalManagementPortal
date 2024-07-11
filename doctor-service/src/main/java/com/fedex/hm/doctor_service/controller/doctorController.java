package com.fedex.hm.doctor_service.controller;


import com.fedex.hm.doctor_service.dto.requestDto.availabilityRequestDto;
import com.fedex.hm.doctor_service.dto.requestDto.requestDto;
import com.fedex.hm.doctor_service.dto.responseDto.availabilityResponseDto;
import com.fedex.hm.doctor_service.dto.responseDto.responseDto;
import com.fedex.hm.doctor_service.service.doctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/doctor")
@CrossOrigin(origins = "http://localhost:4200")
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

    @GetMapping("/specializations")
    ResponseEntity<List<String>> getSpecializations(){
        List<String> specializationList = doctorService.getSpecializations();
        return ResponseEntity.ok(specializationList);
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


    // Availability Schedules


    @PostMapping("/{id}/availability")
    ResponseEntity<availabilityResponseDto> saveAvailability
            (@PathVariable Long id,@RequestBody availabilityRequestDto dto)
    {
        availabilityResponseDto schedule = doctorService.saveAvailability(id,dto);
        return ResponseEntity.ok(schedule);
    }

    @GetMapping("/{doctorId}/availabilityOn/{date}")
    ResponseEntity<List<availabilityResponseDto>> getAvailabilityByDoctorId(@PathVariable Long doctorId, @PathVariable String date){
        List<availabilityResponseDto> availabilityList = doctorService.getAvailabilityByDoctorIdAndDateAndBookedFalse(doctorId,date);
        return ResponseEntity.ok(availabilityList);
    }


    @DeleteMapping("/availability/{availabilityId}")
    ResponseEntity<String> deleteAvailability(@PathVariable Long availabilityId){
        doctorService.deleteAvailability(availabilityId);
        return ResponseEntity.ok("Deleted Successfully");
    }


    // Authentication
    @PostMapping("/authenticate")
    public ResponseEntity<responseDto> authenticate(@RequestHeader("email") String email,
                                                    @RequestHeader("password") String password){
        responseDto dto = doctorService.authenticate(email,password);
        return ResponseEntity.ok(dto);
    }
}
