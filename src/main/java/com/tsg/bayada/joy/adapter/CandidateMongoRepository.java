package com.tsg.bayada.joy.adapter;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CandidateMongoRepository extends MongoRepository<CandidateEntity,Long> {

  CandidateEntity findById(String id);
}
