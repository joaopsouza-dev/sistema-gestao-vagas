package com.joaopedro.gestaoVagas.service;

import com.joaopedro.gestaoVagas.domain.JobEntity;
import com.joaopedro.gestaoVagas.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    @PostMapping("/")
    public JobEntity createJob(JobEntity jobEntity) {
        return this.jobRepository.save(jobEntity);
    }
}
