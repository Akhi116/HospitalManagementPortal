package com.fedex.hm.doctor_service.repository;

import com.fedex.hm.doctor_service.model.AvailabilitySchedules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface availabilityRepository extends JpaRepository<AvailabilitySchedules, Long> {

    List<AvailabilitySchedules> findByDoctorIdAndDateAndIsBookedFalse(Long doctorId,String date);

    AvailabilitySchedules findByDoctorIdAndDateAndSlotTime(Long doctorId, String date, String time);
}
