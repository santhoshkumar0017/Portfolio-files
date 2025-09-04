package com.JobPortal.JobPortal.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name ="Jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String companyName;

    @Column(nullable = false)
    private String role;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Sector sector;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ExperienceLevel experienceLevel;

    @Column(nullable = false)
    private String description;

}

