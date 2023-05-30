package com.tsg.bayada.joy.adapter;


import com.tsg.bayada.joy.audit.Auditable;
import com.tsg.bayada.joy.domain.*;
import lombok.*;
//import org.hibernate.usertype.UserType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "user")
@Component
public class CandidateEntity extends Auditable<String> {
  @Id
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
