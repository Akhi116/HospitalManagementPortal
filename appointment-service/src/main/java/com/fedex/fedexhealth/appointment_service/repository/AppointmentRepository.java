package com.fedex.fedexhealth.appointment.repository;

import com.fedex.fedexhealth.appointment.entity.Appointment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Long> {

    List<Appointment> findByPatientId(Long id);

    List<Appointment> findByDoctorId(Long id);

}
