package org.example.gestionrh.controller;


import org.example.gestionrh.dto.CandidateDTO;
import org.example.gestionrh.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @GetMapping
    public List<CandidateDTO> getAllCandidates() {
        return candidateService.getAllCandidates();
    }

    @GetMapping("/{id}")
    public CandidateDTO getCandidateById(@PathVariable Long id) {
        return candidateService.getCandidateById(id);
    }

    @PostMapping
    public CandidateDTO createCandidate(@RequestBody CandidateDTO candidateDTO) {
        return candidateService.createCandidate(candidateDTO);
    }

    @PutMapping("/{id}")
    public CandidateDTO updateCandidate(@PathVariable Long id, @RequestBody CandidateDTO candidateDTO) {
        return candidateService.updateCandidate(id, candidateDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteCandidate(@PathVariable Long id) {
        candidateService.deleteCandidate(id);
    }
}

