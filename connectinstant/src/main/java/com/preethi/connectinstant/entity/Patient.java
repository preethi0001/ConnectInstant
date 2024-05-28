package com.preethi.connectinstant.entity;

import com.preethi.connectinstant.enums.Symptom;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(value = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Name is required")
    @Size(min = 3, message = "Name must be at least 3 characters long")
    private String name;

    @NotNull(message = "City is required")
    @Size(max = 20, message = "City must be at most 20 characters long")
    private String city;

    @NotNull(message = "Email is required")
    @Email(message = "Please provide a valid email address")
    private String email;

    @NotNull(message = "Phone number is required")
    @Size(min = 10, message = "Phone number must be at least 10 numbers long")
    private String phoneNumber;

    @NotNull(message = "Symptom is required")
    @Enumerated(EnumType.STRING)
    private Symptom symptom;
}
