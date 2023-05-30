package com.tsg.bayada.joy.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateService {
  @Autowired
  private CandidateRepository repo;

  public Candidate createCandidate(Candidate candidate){
    return repo.createCandidate(candidate);
  }

  public Candidate getById(String id) {
Candidate candidate=repo.getCandidateById(id);
return candidate;
  }
}
