package com.ecommerce.ecommerce_website.dto;

import java.math.BigDecimal;
import java.util.List;

import com.ecommerce.ecommerce_website.entity.Payment;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)

public class OrderRequest {
    private BigDecimal totalPrice;
    private List<OrderItemRequest> items;
    private Payment paymentInfo;    
}
