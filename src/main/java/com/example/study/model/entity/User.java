package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 *  @Entity => DB 테이블명과 동일함을 의미한다
 *  @Table => DB의 테이블 명을 의미하지만, 현재 클래스 네임이 동일하므로 생략
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String account;

    private String password;

    private String status;

    private String email;

    // DB는 phone_number 와 같이 스네이크 케이스인데, JPA는 해당 부분의 네이밍을 자동으로 설정해준다.
    private String phoneNumber;

    private LocalDateTime registeredAt;

    private LocalDateTime unregisteredAt;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;
    
    // User : OrderDetail = 1 : N
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user") // mappedBy는 OrderDetail에 있는 user 변수와 동일해야함
//    private List<OrderDetail> orderDetailList;

}
