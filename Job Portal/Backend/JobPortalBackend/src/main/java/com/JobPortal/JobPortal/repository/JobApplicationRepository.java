package com.JobPortal.JobPortal.repository;

import com.JobPortal.JobPortal.entity.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobApplicationRepository extends JpaRepository<JobApplication,Long> {
}
