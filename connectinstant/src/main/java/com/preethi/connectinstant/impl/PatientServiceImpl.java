package com.preethi.connectinstant.impl;


import com.preethi.connectinstant.entity.Patient;
import com.preethi.connectinstant.repository.PatientRepository;
import com.preethi.connectinstant.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void removePatient(Long id) {
        patientRepository.deleteById(id);
    }
}
