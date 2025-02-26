package com.ecommerce.ecommerce_website.dto;

import lombok.Data;

@Data

public class OrderItemRequest {
    private int productId;
    private int quantity;
        
}
