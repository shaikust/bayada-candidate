package com.bayada.candidate.config;

import com.bayada.candidate.audit.AuditorAwareImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoAuditing(auditorAwareRef = "auditorProvider")

public class MongoConfig {
  @Bean
  AuditorAware<String> auditorProvider(){
    return new AuditorAwareImpl();

  }
}
