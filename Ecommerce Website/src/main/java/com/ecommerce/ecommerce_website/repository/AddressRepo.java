package com.ecommerce.ecommerce_website.repository;

import com.ecommerce.ecommerce_website.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
    
}
