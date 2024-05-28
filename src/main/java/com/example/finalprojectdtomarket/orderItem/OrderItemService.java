package com.example.finalprojectdtomarket.orderItem;

import com.example.finalprojectdtomarket.cart.CartJPARepository;
import com.example.finalprojectdtomarket.order.OrderJPARepository;
import com.example.finalprojectdtomarket.product.ProductJPARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderItemService {
    private final OrderJPARepository orderJPARepository;
    private final OrderItemJPARepository orderItemJPARepository;
    private final CartJPARepository cartJPARepository;
    private final ProductJPARepository productJPARepository;

    //order-save-form


}
