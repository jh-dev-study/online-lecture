package com.example.study.repository;

import com.example.study.StudyApplication;
import com.example.study.model.entity.Item;
import com.example.study.model.entity.User;
import com.example.study.respository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest    // JPA 테스트 관련 컴포넌트 import
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)  // 실제 DB 사용
@DisplayName("UserRepository 테스트")
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class UserRepositoryTest {

    // DI - Dependency Injection
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {
        String account = "Test01";
        String password = "Test01";
        String status = "REGISTERED";
        String email = "Test01@gmail.com";
        String phoneNumber = "010-1111-2222";
        LocalDateTime registeredAt = LocalDateTime.now();
        LocalDateTime createdAt = LocalDateTime.now();
        String createdBy = "AdminServer";


        User user = new User();
        user.setAccount(account);
        user.setPassword(password);
        user.setStatus(status);
        user.setEmail(email);
        user.setPhoneNumber(phoneNumber);
        user.setRegisteredAt(registeredAt);
        user.setCreatedAt(createdAt);
        user.setCreatedBy(createdBy);

        User newUser = userRepository.save(user);

        Assertions.assertNotNull(newUser);

    }

    @Test
    @Transactional
    public void read() {
        String phoneNumber = "010-1111-2222";
        User user = userRepository.findFirstByPhoneNumberOrderByIdDesc(phoneNumber);

        Assertions.assertNotNull(user);
    }

    @Test
    public void update() {
        Optional<User> user = userRepository.findById(6L);

        user.ifPresent(selectUser ->{
            selectUser.setAccount("PPPP");
            selectUser.setUpdatedAt(LocalDateTime.now());
            selectUser.setUpdatedBy("update method()");

            // 얘는 왜 Update가 되는건지는? 6L(id)값이 중요한데, SELECT를 했을때 존재하면 Update가 됨.
            userRepository.save(selectUser);
        });
    }

    @Test
    public void delete() {
        Optional<User> user = userRepository.findById(6L);

        // user는 값이 존재해야 한다.
        Assertions.assertTrue(user.isPresent());

        user.ifPresent(selectUser ->{
            userRepository.delete(selectUser);
        });

        Optional<User> deleteUser = userRepository.findById(6L);


        Assertions.assertFalse(deleteUser.isPresent()); // False
        assertThat(deleteUser.isPresent()).isEqualTo(false);
    }
}
