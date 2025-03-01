package com.springboot_auditing.springboot_auditing.model;

import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Getter
@Setter
@Document(collection = "users")
public class UserEntity {

    private static final Logger logger = LoggerFactory.getLogger(UserEntity.class);

    private String id;
    private String name;
    private String email;

    @CreatedBy
    private String createdBy;

    @CreatedDate
    private Instant createdDate;

    @LastModifiedBy
    private String lastModifiedBy;

    @LastModifiedDate
    private Instant lastModifiedDate;

    public UserEntity() {
        logger.info("User entity created: {}", this);
    }

    public void onUpdate() {
        logger.info("User entity updated: {}", this);
    }
}
