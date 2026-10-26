package com.joaopedro.gestaoVagas.controller;

import com.joaopedro.gestaoVagas.domain.JobEntity;
import com.joaopedro.gestaoVagas.service.JobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobService jobService;

    @RequestMapping("/")
    public JobEntity create (@Valid @RequestBody JobEntity job) {
        return this.jobService.createJob(job);
    }
}
