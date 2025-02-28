package com.ecommerce.ecommerce_website.service.interf;


import com.ecommerce.ecommerce_website.dto.CategoryDto;
import com.ecommerce.ecommerce_website.dto.Response;

public interface CategoryService {

    Response createCategory(CategoryDto categoryRequest);
    Response updateCategory(Long categoryId, CategoryDto categoryRequest);
    Response getAllCategories();
    Response getCategoryById(Long categoryId);
    Response deleteCategory(Long categoryId);
}

