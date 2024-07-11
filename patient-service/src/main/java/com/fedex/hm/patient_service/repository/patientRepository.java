package com.fedex.hm.patient_service.repository;

import com.fedex.hm.patient_service.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository

public interface patientRepository extends JpaRepository<Patient, Long> {

    List<Patient> findByNameContaining(String name);

    Optional<Patient> findByEmail(String email);
}
