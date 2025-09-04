package com.JobPortal.JobPortal.controller;

import com.JobPortal.JobPortal.entity.ExperienceLevel;
import com.JobPortal.JobPortal.entity.Job;
import com.JobPortal.JobPortal.entity.Sector;
import com.JobPortal.JobPortal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobportal")
@CrossOrigin("*")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping
    public List<Job> findAllJobs(){
        return jobService.findAllJobs();
    }

    @GetMapping("/{id}")
    public Job findById(@PathVariable Long id){
        return jobService.findById(id);
    }

    @GetMapping("/searchByExperienceLevel")
    public List<Job> findByExperienceLevel(@RequestParam ExperienceLevel experienceLevel){
        return jobService.findByExperienceLevel(experienceLevel);
    }

    @GetMapping("/searchBySector")
    public List<Job> findBySector(@RequestParam Sector sector){
        return jobService.findBySector(sector);
    }

    @GetMapping("/search")
    public List<Job> searchJobs(
            @RequestParam(required = false) ExperienceLevel experienceLevel,
            @RequestParam(required = false) Sector sector) {

        if (experienceLevel != null && sector != null) {
            return jobService.findByExperienceLevelAndSector(experienceLevel, sector);
        } else if (experienceLevel != null) {
            return jobService.findByExperienceLevel(experienceLevel);
        } else if (sector != null) {
            return jobService.findBySector(sector);
        } else {
            return jobService.findAllJobs();
        }
    }

    @PostMapping
    public Job save(@RequestBody Job job){
        return jobService.save(job);
    }




}
