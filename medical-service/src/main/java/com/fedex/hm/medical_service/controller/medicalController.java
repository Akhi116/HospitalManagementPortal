package com.fedex.hm.medical_service.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.fedex.hm.medical_service.model.medicalEntity;
import com.fedex.hm.medical_service.repository.medicalrecordsRepository;

@RestController
public class medicalController {

@Autowired
private medicalrecordsRepository repository;
@PostMapping("/add")
    public String postData(@RequestBody medicalEntity medicalBody){

        repository.save(medicalBody);
        return "success";



    }

}
