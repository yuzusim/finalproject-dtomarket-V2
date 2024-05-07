package com.example.finalprojectdtomarket.orderItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

public interface OrderItemJPARepository extends JpaRepository<OrderItem, Integer> {

    @Modifying
    @Query("delete from OrderItem oi where oi.product.id = :productId")
    void deleteByProductId(@PathVariable("productId") Integer productId);

}
