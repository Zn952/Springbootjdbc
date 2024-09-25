package org.example.springboot_jdbc_experiment1.repository;

import lombok.extern.slf4j.Slf4j;
import org.example.springboot_jdbc_experiment1.dox.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Slf4j
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    void save() {
        var user = User.builder()
                .name("ZLY")
                .build();
        userRepository.save(user);
    }
}