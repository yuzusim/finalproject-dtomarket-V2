package com.example.finalprojectdtomarket.cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

public interface CartJPARepository extends JpaRepository<Cart, Integer> {

    @Modifying
    @Query("delete from Cart c where c.product.id = :productId")
    void deleteByProductId(@PathVariable("productId") Integer productId);

}
