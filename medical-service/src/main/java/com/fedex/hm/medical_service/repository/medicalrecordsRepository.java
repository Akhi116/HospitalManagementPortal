package com.fedex.hm.medical_service.repository;

import com.fedex.hm.medical_service.dto.responseDto.medicalResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fedex.hm.medical_service.model.medicalEntity;

import java.util.List;

public interface medicalrecordsRepository extends JpaRepository<medicalEntity,Long> {
    List<medicalEntity> findByPatientId(Long id);

}
