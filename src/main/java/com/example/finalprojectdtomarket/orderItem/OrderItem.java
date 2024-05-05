package com.example.finalprojectdtomarket.orderItem;

import com.example.finalprojectdtomarket.order.Order;
import com.example.finalprojectdtomarket.product.Product;
import com.example.finalprojectdtomarket.user.User;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
@Table(name = "order_item_tb")
@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;

    @Column
    private String status;      // 주문 상태 -> true: 주문 완료, false: 주문 취소

//    @CreationTimestamp
    private Timestamp createdAt;

    @Builder
    public OrderItem(Integer id, User user, Product product, Order order, String status, Timestamp createdAt) {
        this.id = id;
        this.user = user;
        this.product = product;
        this.order = order;
        this.status = status;
        this.createdAt = createdAt;
    }
}
