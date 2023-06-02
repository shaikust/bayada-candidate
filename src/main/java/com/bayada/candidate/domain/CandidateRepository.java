package com.bayada.candidate.domain;

import org.springframework.http.ResponseEntity;

public interface CandidateRepository {
public Candidate createCandidate(Candidate candidate);
public Candidate getCandidateById(String id);
public ResponseEntity updateCandidate(Candidate candidate);
}
