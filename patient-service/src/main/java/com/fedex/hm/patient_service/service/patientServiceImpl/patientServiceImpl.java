package com.fedex.hm.patient_service.service.patientServiceImpl;

import com.fedex.hm.patient_service.dto.requestDto;
import com.fedex.hm.patient_service.dto.responseDto;
import com.fedex.hm.patient_service.globalExceptions.customExceptions.PatientNotFoundException;
import com.fedex.hm.patient_service.mapper.dtoToEntityMapper;
import com.fedex.hm.patient_service.model.Patient;
import com.fedex.hm.patient_service.repository.patientRepository;
import com.fedex.hm.patient_service.service.patientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class patientServiceImpl implements patientService {

    @Autowired
    private patientRepository repository;

    @Autowired
    private dtoToEntityMapper mapper;


    @Override
    public responseDto savePatient(requestDto dto) {
        Patient patient = mapper.toConvertEntity(dto);
        repository.save(patient);
        return mapper.toConvertDto(patient);
    }

    @Override
    public responseDto getPatientById(Long id) {
        Patient patient = repository.findById(id).orElseThrow(()-> new PatientNotFoundException("Patient not found with Id: " + id));
        return mapper.toConvertDto(patient);
    }

    @Override
    public List<responseDto> getPatientByName(String name) {
        List<Patient> patientList = repository.findByNameContaining(name);
        if(patientList.isEmpty()){
            throw new PatientNotFoundException("No Patients are found with name: " + name);
        }
        return patientList.stream().map(mapper::toConvertDto).collect(Collectors.toList());
    }

    @Override
    public List<responseDto> getAll() {
        List<Patient> patientList = repository.findAll();
        if(patientList.isEmpty()){
            throw new PatientNotFoundException("No Patients are found");
        }
        return patientList.stream().map(mapper::toConvertDto).collect(Collectors.toList());
    }

    @Override
    public responseDto updatePatient(Long id, requestDto dto) {
       Patient patient = repository.findById(id).orElseThrow(()->new PatientNotFoundException("Patient not found with id: " + id));

       patient.setName(dto.getName());
       patient.setDateOfBirth(dto.getDateOfBirth());
       patient.setGender(dto.getGender());
       patient.setContactNumber(dto.getContactNumber());
       patient.setAddress(dto.getAddress());

       repository.save(patient);

       return mapper.toConvertDto(patient);
    }

    @Override
    public responseDto updatePatientByFields(Long id, Map<String, Object> fields) {
       Optional<Patient> patient = repository.findById(id);

       if(patient.isPresent()){
           fields.forEach((key,value)->{
               Field field = ReflectionUtils.findField(Patient.class, key);
               field.setAccessible(true);
               ReflectionUtils.setField(field, patient.get(), value);
           });

           repository.save(patient.get());
           return mapper.toConvertDto(patient.get());
       }

       throw new PatientNotFoundException("Patient not found with id: " + id);
    }

    @Override
    public void deletePatientById(Long id) {
        Patient patient = repository.findById(id).orElseThrow(()->new PatientNotFoundException("No patient found with id: " + id));
        repository.deleteById(id);

    }
}
