package com.bayada.candidate.adapter;

import com.bayada.candidate.domain.Candidate;
import com.bayada.candidate.domain.CandidateRepository;
import com.bayada.candidate.exception.CandidateNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CandidateServiceImp implements CandidateRepository {
  @Autowired
  private CandidateMongoRepository candidateMongoRepository;
  private final MongoTemplate mongoTemplate;


  @Autowired
  private CandidateMapper mapper;

  public CandidateServiceImp(MongoTemplate mongoTemplate) {
    this.mongoTemplate = mongoTemplate;
  }

  @Override
  public Candidate createCandidate(Candidate candidate) {
    return mapper.toModel(candidateMongoRepository.save(mapper.toEntity(candidate)));
  }

  @Override
  public Candidate getCandidateById(String id) {
    return mapper.toModel(candidateMongoRepository.findById(id).orElseThrow(() -> new CandidateNotFoundException()));
  }

  @Override
  public ResponseEntity updateCandidate(Candidate candidate) {
    CandidateEntity existingCandidate = candidateMongoRepository.findById(candidate.getId()).orElseThrow(() -> new CandidateNotFoundException());
    existingCandidate.setEmail(candidate.getEmail());
    existingCandidate.setPhone(candidate.getPhone());
    existingCandidate.setScreening(candidate.getScreening());
    existingCandidate.setInterviewType(candidate.getInterviewType());
    existingCandidate.setPrimaryCommunication(candidate.getPrimaryCommunication());
    existingCandidate.setInterviewEligibility(candidate.getInterviewEligibility());
    existingCandidate.setZip(candidate.getZip());
    existingCandidate.setUserFName(candidate.getUserFName());
    existingCandidate.setUserMName(candidate.getUserMName());
    existingCandidate.setUserLName(candidate.getUserLName());
    candidateMongoRepository.save(existingCandidate);
    return new ResponseEntity(HttpStatus.OK);
  }

}
