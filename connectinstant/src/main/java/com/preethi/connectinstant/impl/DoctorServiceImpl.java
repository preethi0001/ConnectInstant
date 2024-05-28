package com.preethi.connectinstant.impl;


import com.preethi.connectinstant.entity.Doctor;
import com.preethi.connectinstant.repository.DoctorRepository;
import com.preethi.connectinstant.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public List<Doctor> findDoctorsByCityAndSymptom(String city, String symptom) {
        String speciality = getSpeciality(symptom);
        return doctorRepository.findByCityAndSpeciality(city, speciality);
    }

    private String getSpeciality(String symptom) {
        switch (symptom) {
            case "Arthritis":
            case "Back Pain":
            case "Tissue injuries":
                return "Orthopedic";
            case "Dysmenorrhea":
                return "Gynecology";
            case "Skin infection":
            case "Skin burn":
                return "Dermatology";
            case "Ear pain":
                return "ENT specialist";
            default:
                return null;
        }
    }
}
