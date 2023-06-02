package com.bayada.candidate.controller;

import com.bayada.candidate.domain.Candidate;
import com.bayada.candidate.domain.CandidateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {
  @Autowired
  private CandidateService candidateService;
  @PostMapping
  public Candidate createCandidate(@RequestBody Candidate candidate){
    return candidateService.createCandidate(candidate);
  }
  @GetMapping("/{id}")
  public Candidate getCandidateById(@PathVariable String id){
    return  candidateService.getById(id);
  }
  @PatchMapping
  public ResponseEntity<String> updateCandidate( @RequestBody Candidate candidate) {
    return  candidateService.update(candidate);
  }
}


