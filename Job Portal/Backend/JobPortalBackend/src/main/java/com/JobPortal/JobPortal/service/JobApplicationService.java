package com.JobPortal.JobPortal.service;

import com.JobPortal.JobPortal.entity.JobApplication;
import com.JobPortal.JobPortal.repository.JobApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobApplicationService {

    @Autowired
    private JobApplicationRepository jobApplicationRepository;

    public List<JobApplication> findAll() {
        return jobApplicationRepository.findAll();
    }

    public JobApplication save(JobApplication jobApplication) {
        return jobApplicationRepository.save(jobApplication);
    }
}
