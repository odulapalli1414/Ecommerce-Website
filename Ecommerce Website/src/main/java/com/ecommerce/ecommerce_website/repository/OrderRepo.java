package com.ecommerce.ecommerce_website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.ecommerce_website.entity.Order;

public interface OrderRepo extends JpaRepository<Order, Long> {
    
}
