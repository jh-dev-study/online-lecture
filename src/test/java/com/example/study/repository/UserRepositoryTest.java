package com.example.study.repository;

import com.example.study.model.entity.User;
import com.example.study.respository.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;

@DataJpaTest    // JPA 테스트 관련 컴포넌트 import
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)  // 실제 DB 사용
@DisplayName("ItemRepositoryTest 테스트")
public class UserRepositoryTest {

    // DI - Dependency Injection
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {
        User user = new User();
        user.setAccount("TestUser03");
        //user.setId();   // Not Null, AUTO_INCREMENT
        user.setEmail("TestUser03@gmail.com");
        user.setPhoneNumber("010-2222-2222");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("admin");

        User newUser = userRepository.save(user);
        System.out.println("newUser = " + newUser);
        System.out.println(newUser.getId());

    }

    public void read() {

    }

    public void update() {

    }

    public void delete() {

    }
}
