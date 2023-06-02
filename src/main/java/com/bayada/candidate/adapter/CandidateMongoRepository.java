package com.bayada.candidate.adapter;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CandidateMongoRepository extends MongoRepository<CandidateEntity,Long> {

  Optional<CandidateEntity> findById(String id);

}
