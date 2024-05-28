package com.preethi.connectinstant.repository;

import com.preethi.connectinstant.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
