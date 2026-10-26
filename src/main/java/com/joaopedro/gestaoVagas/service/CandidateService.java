package com.joaopedro.gestaoVagas.service;

import com.joaopedro.gestaoVagas.domain.CandidateEntity;
import com.joaopedro.gestaoVagas.exception.UserFoundException;
import com.joaopedro.gestaoVagas.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateService {

    @Autowired
    CandidateRepository candidateRepository;

    public CandidateEntity createCandidate(CandidateEntity candidate) {
        this.candidateRepository
                .findByUsernameOrEmail(candidate.getUsername(), candidate.getEmail())
                .ifPresent((user) -> {
                    throw new UserFoundException();
                });
        return this.candidateRepository.save(candidate);
    }


}
