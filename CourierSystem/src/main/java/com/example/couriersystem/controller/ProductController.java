package com.example.couriersystem.controller;

import com.example.couriersystem.model.Product; //for test purpose
import com.example.couriersystem.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<Product> getAllProducts() {return productRepository.findAll();}

    @GetMapping("/{id}")
    public void getProductById(@PathVariable Long id) {}

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @PutMapping("/{id}")
    public void updateProduct(@PathVariable Long id) {}

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {}
}
