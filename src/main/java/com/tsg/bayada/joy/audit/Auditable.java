package com.tsg.bayada.joy.audit;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Getter
@Setter
public class Auditable<U> {
  @CreatedBy
  private U createdBy;

  @CreatedDate
  private LocalDateTime creationDate;

  @LastModifiedBy
  private U lastModifiedBy;

  @LastModifiedDate
  private LocalDateTime lastModifiedDate;
}

