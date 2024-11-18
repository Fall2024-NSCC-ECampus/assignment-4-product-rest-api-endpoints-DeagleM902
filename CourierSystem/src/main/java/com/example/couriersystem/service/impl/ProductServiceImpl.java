package com.example.couriersystem.service.impl;

import com.example.couriersystem.repository.ProductRepository;
import com.example.couriersystem.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Override
    public void getAllProducts() {}

    @Override
    public void getProductById(Long id) {}

    @Override
    public void createProduct() {}

    @Override
    public void updateProduct() {}

    @Override
    public void deleteProduct() {}
}
