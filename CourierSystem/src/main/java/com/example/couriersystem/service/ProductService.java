package com.example.couriersystem.service;

import com.example.couriersystem.model.Product;

public interface ProductService {
    //Change return types to relevant type
    void getAllProducts();
    void getProductById(Long id);
    void createProduct();
    void updateProduct();
    void deleteProduct();
}
