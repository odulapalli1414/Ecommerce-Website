package com.ecommerce.ecommerce_website.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.ecommerce_website.entity.Category;
import com.ecommerce.ecommerce_website.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {
    List<Product> findByCategory(Category categoryId);
    List<Product> findByNameContainingorDescriptionContaining(String name, String description);

}
