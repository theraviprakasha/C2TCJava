package com.example.demo;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {
    @Autowired
    private CandidateRepository candidateRepository;

    public List<Candidate> searchByName(String name) {
        return candidateRepository.findByNameContaining(name);
    }

    public List<Candidate> searchByHallTicketNumber(String hallTicketNumber) {
        return candidateRepository.findByHallTicketNumberContaining(hallTicketNumber);
    }

    public List<Candidate> listAll() {
        return candidateRepository.findAll();
    }
}
