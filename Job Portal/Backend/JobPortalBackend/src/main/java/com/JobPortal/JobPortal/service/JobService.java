package com.JobPortal.JobPortal.service;

import com.JobPortal.JobPortal.entity.ExperienceLevel;
import com.JobPortal.JobPortal.entity.Job;
import com.JobPortal.JobPortal.entity.Sector;
import com.JobPortal.JobPortal.exception.ResoursesNotExisting;
import com.JobPortal.JobPortal.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public List<Job> findAllJobs() {
        return jobRepository.findAll();
    }

    public List<Job> findByExperienceLevel(ExperienceLevel experienceLevel) {
        return jobRepository.findByExperienceLevel(experienceLevel);
    }

    public Job save(Job job) {
        return jobRepository.save(job);
    }

    public List<Job> findBySector(Sector sector) {
        return jobRepository.findBySector(sector);
    }

    public List<Job> findByExperienceLevelAndSector(ExperienceLevel level, Sector sector) {
        return jobRepository.findByExperienceLevelAndSector(level, sector);
    }

    public Job findById(Long id) {
        Job job= jobRepository.findById(id).orElseThrow( () ->
                new ResoursesNotExisting("Job is not existing"+id));
        return job;
    }
}
