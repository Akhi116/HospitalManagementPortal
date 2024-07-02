package com.fedex.hm.patient_service.controller;


import com.fedex.hm.patient_service.dto.requestDto;
import com.fedex.hm.patient_service.dto.responseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.fedex.hm.patient_service.service.patientService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/patient")
public class patientController {

    @Autowired
    private patientService patientService;

    @PostMapping("/create")
    ResponseEntity<responseDto> savePatient(@RequestBody requestDto dto) throws URISyntaxException {
        responseDto patient = patientService.savePatient(dto);
        URI location = new URI("/api/patient/" + patient.getId());
        return ResponseEntity.created(location).build();
    }

    @GetMapping()
    ResponseEntity<List<responseDto>> getAll(){
        List<responseDto> patientEntities = patientService.getAll();
        return ResponseEntity.ok(patientEntities);
    }

    @GetMapping("/id/{id}")
    ResponseEntity<responseDto> getPatientById(@PathVariable Long id){
        responseDto patient = patientService.getPatientById(id);
        return ResponseEntity.ok(patient);
    }

    @GetMapping("/name/{name}")
    ResponseEntity<List<responseDto>> getPatientByName(@PathVariable String name){
        List<responseDto> patientList = patientService.getPatientByName(name);
        return ResponseEntity.ok(patientList);
    }

    @PutMapping("/update/{id}")
    ResponseEntity<responseDto> updatePatient(@PathVariable Long id, @RequestBody requestDto dto){
        responseDto patient = patientService.updatePatient(id,dto);
        return ResponseEntity.ok(patient);
    }

    @PatchMapping("/update/{id}")
    ResponseEntity<responseDto> updatePatientByFields(@PathVariable Long id, @RequestBody Map<String, Object> field){
        responseDto patient = patientService.updatePatientByFields(id,field);
        return ResponseEntity.ok(patient);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<String> deletePatientById(@PathVariable Long id){
        patientService.deletePatientById(id);
        return ResponseEntity.ok("Deleted successfully..!!");
    }


}
