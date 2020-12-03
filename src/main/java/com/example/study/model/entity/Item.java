package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer price;
    private String content;

    // LAZY = 지연로딩, EAGER = 즉시로딩(연관관계가 설정된 모든 테이블이 Join - 성능저하..)
    // EAGER = 1:1, 연관관계에 있어 한건이 존재할 때 추천
    // item_id = order_detail.item_id
    // user_id = order_detail.user_id
    // where item.id = ?

    // Item : OrderDetail = 1 : N
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "item") // OrderDetail에 item 변수에 매핑
    private List<OrderDetail> orderDetailList;
}
