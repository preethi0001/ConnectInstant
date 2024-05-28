package com.preethi.connectinstant.service;


import com.preethi.connectinstant.entity.Patient;

public interface PatientService {
    Patient addPatient(Patient patient);
    void removePatient(Long id);
}
