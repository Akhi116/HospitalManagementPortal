package com.fedex.hm.medical_service.controller;


import com.fedex.hm.medical_service.dto.responseDto.medicalResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.fedex.hm.medical_service.dto.requestDto.medicalRequestDto;
import com.fedex.hm.medical_service.service.medicalService;


import java.util.List;

@RestController
@RequestMapping("/medicalrecords")
public class medicalController {

    @Autowired
    private medicalService medicalService;

@PostMapping("/add")
    public ResponseEntity<medicalResponseDto> postData(@RequestBody medicalRequestDto dto){
        medicalResponseDto responseDto = medicalService.saveMedicalRecord(dto);
        return ResponseEntity.ok(responseDto);
    }

    @GetMapping("/getall")
    public ResponseEntity<List<medicalResponseDto>> getData(){
    List<medicalResponseDto> list= medicalService.getMedicalRecords();
    return ResponseEntity.ok(list);

    }

    @GetMapping("/{id}")
    public ResponseEntity<List<medicalResponseDto>> getById(@PathVariable Long id ){
    List<medicalResponseDto> list=medicalService.getRecordById(id);

    return ResponseEntity.ok(list);
    }


}
