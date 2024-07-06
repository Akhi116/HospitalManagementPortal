package com.fedex.hm.doctor_service.repository;

import com.fedex.hm.doctor_service.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface doctorRepository extends JpaRepository<Doctor, Long> {

    List<Doctor> findBySpecialization(String specialization);
}
