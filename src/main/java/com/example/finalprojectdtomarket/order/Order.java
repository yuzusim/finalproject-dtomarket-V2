package com.example.finalprojectdtomarket.order;

import com.example.finalprojectdtomarket.cart.Cart;
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
@Table(name = "order_tb")
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    private Cart cart;

    @Column
    private Integer sum;

//    @CreationTimestamp
    private Timestamp createdAt;

    @Builder
    public Order(Integer id, User user, Product product, Cart cart, Integer sum, Timestamp createdAt) {
        this.id = id;
        this.user = user;
        this.product = product;
        this.cart = cart;
        this.sum = sum;
        this.createdAt = createdAt;
    }
}
