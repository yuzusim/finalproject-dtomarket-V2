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

//    @CreationTimestamp
    private Timestamp createdAt;

    @Builder
    public OrderItem(Integer id, User user, Product product, Order order, Timestamp createdAt) {
        this.id = id;
        this.user = user;
        this.product = product;
        this.order = order;
        this.createdAt = createdAt;
    }
}
