package com.fedex.hm.doctor_service.repository;

import com.fedex.hm.doctor_service.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface doctorRepository extends JpaRepository<Doctor, Long> {

    List<Doctor> findBySpecialization(String specialization);

    @Query("select DISTINCT i.specialization from Doctor i")
    List<String> findSpecializations();

    Optional<Doctor> findByEmail(String email);
}
