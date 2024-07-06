package com.fedex.hm.appointment_service.repository;


import com.fedex.hm.appointment_service.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    List<Appointment> findByPatientId(Long id);

    List<Appointment> findByDoctorId(Long id);

}
