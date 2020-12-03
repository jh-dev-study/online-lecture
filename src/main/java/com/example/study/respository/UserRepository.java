package com.example.study.respository;

import com.example.study.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> { // Long => User 클래스에서식별자인 id 타입

    // JPA에서 findBy => SELECT문임을 파악. 그 후 Acoount를 매칭시킨다.
    // SELECT * FROM USER WHERE account = ?; << test03, ...
    Optional<User> findByAccount(String account);

    Optional<User> findByEmail(String email);

    // select * from user where account = ? and email = ?
    Optional<User> findByAccountAndEmail(String account, String email);
}
