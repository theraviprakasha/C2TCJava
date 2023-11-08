package com.example.demo;




import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
    List<Candidate> findByNameContaining(String name);
    List<Candidate> findByHallTicketNumberContaining(String hallTicketNumber);
}
