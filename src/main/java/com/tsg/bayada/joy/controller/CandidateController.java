package com.tsg.bayada.joy.controller;

import com.tsg.bayada.joy.domain.Candidate;
import com.tsg.bayada.joy.domain.CandidateService;
import io.micrometer.observation.Observation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {
  @Autowired
  private CandidateService candidateService;
  @PostMapping
  public Candidate createCandidate(@RequestBody Candidate payload){
    return candidateService.createCandidate(payload);
  }
  @GetMapping("/{id}")
  public Candidate getCandidateById(@PathVariable String id){
    return  candidateService.getById(id);
  }
}


