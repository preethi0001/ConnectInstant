package com.preethi.connectinstant.controller;

import com.preethi.connectinstant.entity.Doctor;
import com.preethi.connectinstant.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/{city}/{symptom}/suggested-doctors")
    public List<Doctor> getSuggestedDoctors(@PathVariable String city, @PathVariable String symptom) {
        return doctorService.findDoctorsByCityAndSymptom(city, symptom);
    }
}

