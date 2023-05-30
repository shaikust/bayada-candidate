package com.tsg.bayada.joy.domain;

public interface CandidateRepository {
public Candidate createCandidate(Candidate candidate);
public Candidate getCandidateById(String id);
}
