package com.springboot_auditing.springboot_auditing.repository;

import com.springboot_auditing.springboot_auditing.model.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserEntity, String> {
}

