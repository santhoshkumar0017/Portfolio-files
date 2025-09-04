package com.JobPortal.JobPortal.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "JobApplications")
public class JobApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String companyName;

    @Column(nullable = false)
    private String role;

    @Column(nullable = false)
    private String experienceLevel;

}
