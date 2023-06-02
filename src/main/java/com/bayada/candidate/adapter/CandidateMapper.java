package com.bayada.candidate.adapter;

import com.bayada.candidate.domain.Candidate;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CandidateMapper {

  public CandidateEntity toEntity(Candidate candidate){
    return CandidateEntity.builder()
      .id(UUID.randomUUID().toString().split("-")[0])
      .email(candidate.getEmail())
      .phone(candidate.getPhone())
      .interviewEligibility(candidate.getInterviewEligibility())
      .interviewType(candidate.getInterviewType())
      .zip(candidate.getZip())
      .jobs(candidate.getJobs())
      .userFName(candidate.getUserFName())
      .userLName(candidate.getUserLName())
      .userMName(candidate.getUserMName())
      .userType(candidate.getUserType())
      .screening(candidate.getScreening())
      .primaryCommunication(candidate.getPrimaryCommunication())
      .build();
  }
  public Candidate toModel(CandidateEntity entity){
    return Candidate.builder()
      .id(entity.getId())
      .email(entity.getEmail())
      .phone(entity.getPhone())
      .interviewEligibility(entity.getInterviewEligibility())
      .zip(entity.getZip())
      .jobs(entity.getJobs())
      .userFName(entity.getUserFName())
      .screening(entity.getScreening())
      .userMName(entity.getUserMName())
      .userLName(entity.getUserLName())
      .primaryCommunication(entity.getPrimaryCommunication())
      .userType(entity.getUserType())
      .interviewType(entity.getInterviewType())
      .build();

  }
}
