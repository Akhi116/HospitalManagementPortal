package com.fedex.hm.medical_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fedex.hm.medical_service.model.medicalEntity;

public interface medicalrecordsRepository extends JpaRepository<medicalEntity,Long> {
}
