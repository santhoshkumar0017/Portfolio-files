package com.JobPortal.JobPortal.controller;

import com.JobPortal.JobPortal.entity.JobApplication;
import com.JobPortal.JobPortal.service.JobApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobApplication")
@CrossOrigin("*")
public class JobApplicationController {

    @Autowired
    private JobApplicationService jobApplicationService;

    @GetMapping
    public List<JobApplication> findAll(){
        return jobApplicationService.findAll();
    }

    @PostMapping
    public JobApplication save(@RequestBody JobApplication jobApplication){
        return jobApplicationService.save(jobApplication);
    }
}
