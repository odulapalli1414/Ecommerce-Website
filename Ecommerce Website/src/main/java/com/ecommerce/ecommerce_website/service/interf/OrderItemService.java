package com.ecommerce.ecommerce_website.service.interf;


import com.ecommerce.ecommerce_website.dto.OrderRequest;
import com.ecommerce.ecommerce_website.dto.Response;
import com.ecommerce.ecommerce_website.enums.OrderStatus;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;

public interface OrderItemService {
    Response placeOrder(OrderRequest orderRequest);
    Response updateOrderItemStatus(Long orderItemId, String status);
    Response filterOrderItems(OrderStatus status, LocalDateTime startDate, LocalDateTime endDate, Long itemId, Pageable pageable);
}

