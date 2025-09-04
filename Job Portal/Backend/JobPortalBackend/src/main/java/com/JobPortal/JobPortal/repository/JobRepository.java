package com.JobPortal.JobPortal.repository;

import com.JobPortal.JobPortal.entity.ExperienceLevel;
import com.JobPortal.JobPortal.entity.Job;
import com.JobPortal.JobPortal.entity.Sector;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobRepository extends JpaRepository<Job,Long> {

    List<Job> findByExperienceLevel(ExperienceLevel experienceLevel);

    List<Job> findBySector(Sector sector);

    List<Job> findByExperienceLevelAndSector(ExperienceLevel experienceLevel, Sector sector);
}
