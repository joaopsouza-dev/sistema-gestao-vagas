package com.joaopedro.gestaoVagas.repository;

import com.joaopedro.gestaoVagas.domain.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface JobRepository extends JpaRepository<JobEntity, UUID> {


}
