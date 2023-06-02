package com.bayada.candidate.domain;


import com.bayada.candidate.adapter.CandidateMongoRepository;
import com.bayada.candidate.exception.CandidateNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CandidateService {
  @Autowired
  private CandidateRepository repo;
  @Autowired
  private CandidateMongoRepository candidateMongoRepository;

  public Candidate createCandidate(Candidate candidate){
    return repo.createCandidate(candidate);
  }

  public Candidate getById(String id) {
return repo.getCandidateById(id);
  }

  public ResponseEntity update(Candidate payload) throws CandidateNotFoundException {
    return repo.updateCandidate(payload);
  }
}
