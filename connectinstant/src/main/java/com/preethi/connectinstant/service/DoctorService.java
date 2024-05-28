package com.preethi.connectinstant.service;

import com.preethi.connectinstant.entity.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> findDoctorsByCityAndSymptom(String city, String symptom);
}
