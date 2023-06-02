package com.bayada.candidate.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class Candidate {
  private  String id;
  private UserType userType;
  private String userFName;
  private String userMName;
  private String userLName;
  private String email;
  private String phone;
  private PrimaryCommunication primaryCommunication;
  private List<String> jobs;
  private List<ScreeningQuestion> screening;
  private InterviewType interviewType;
  private InterviewEligibility interviewEligibility;
  private String zip;
}
