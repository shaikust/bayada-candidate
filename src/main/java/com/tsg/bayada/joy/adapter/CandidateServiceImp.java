package com.tsg.bayada.joy.adapter;

import com.tsg.bayada.joy.domain.Candidate;
import com.tsg.bayada.joy.domain.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public class CandidateServiceImp implements CandidateRepository {
  @Autowired
  private CandidateMongoRepository candidateMongoRepository;
@Autowired
private CandidateMapper mapper;
  @Override
  public Candidate createCandidate(Candidate candidate) {
    return mapper.toModel(candidateMongoRepository.save(mapper.toEntity(candidate)));
  }

  @Override
  public Candidate getCandidateById(String id) {
    return mapper.toModel(candidateMongoRepository.findById(id));
  }
}
