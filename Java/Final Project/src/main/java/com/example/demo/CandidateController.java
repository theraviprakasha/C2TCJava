package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidates")
public class CandidateController {
    @Autowired
    private CandidateService candidateService;

    @GetMapping("/search")
    public List<Candidate> search(@RequestParam(name = "q", required = false) String searchQuery) {
        if (searchQuery == null) {
            return candidateService.listAll(); // Return all candidates if no search query provided
        } else {
            // Perform search by name or hall ticket number based on the search query
            if (searchQuery.matches("\\d+")) {
                // If the search query is a number, search by hall ticket number
                return candidateService.searchByHallTicketNumber(searchQuery);
            } else {
                // If the search query is not a number, search by name
                return candidateService.searchByName(searchQuery);
            }
        }
    }
}

