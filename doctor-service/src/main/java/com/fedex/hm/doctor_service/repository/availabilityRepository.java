package com.fedex.hm.doctor_service.repository;

import com.fedex.hm.doctor_service.model.AvailabilitySchedules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface availabilityRepository extends JpaRepository<AvailabilitySchedules, Long> {

    List<AvailabilitySchedules> findByDoctorId(Long doctorId);
    List<AvailabilitySchedules> findByDoctorIdAndDate(Long doctorId, LocalDate date);
}
