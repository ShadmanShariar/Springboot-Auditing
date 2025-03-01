package com.springboot_auditing.springboot_auditing.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.domain.AuditorAware;

@Configuration
@EnableMongoAuditing
public class MongoAuditingConfig {

    // To set Auditor to current logged in user
    @Bean
    public AuditorAware<String> auditorProvider() {
        return new AuditorAwareImpl();
    }
}

