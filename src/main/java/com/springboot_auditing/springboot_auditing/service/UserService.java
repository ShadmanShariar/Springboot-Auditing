package com.springboot_auditing.springboot_auditing.service;

import com.springboot_auditing.springboot_auditing.dto.UserDTO;
import com.springboot_auditing.springboot_auditing.model.UserEntity;
import com.springboot_auditing.springboot_auditing.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Service
public class UserService {

    private final UserRepository userRepository;
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<UserEntity> getUserById(String id) {
        return userRepository.findById(id);
    }

    public UserEntity createUser(UserDTO userDTO) {
        UserEntity user = new UserEntity();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        logger.info("Saving new user: {}", user);
        UserEntity savedUser = userRepository.save(user);
        logger.info("User saved: {}", savedUser);
        return savedUser;
    }

    public UserEntity updateUser(String id, UserDTO userDTO) {
        Optional<UserEntity> existingUser = userRepository.findById(id);
        if (existingUser.isPresent()) {
            UserEntity user = existingUser.get();
            user.setName(userDTO.getName());
            user.setEmail(userDTO.getEmail());
            UserEntity savedUser = userRepository.save(user);
            logger.info("User updated: {}", savedUser);
            return savedUser;
        }
        return null;
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}
