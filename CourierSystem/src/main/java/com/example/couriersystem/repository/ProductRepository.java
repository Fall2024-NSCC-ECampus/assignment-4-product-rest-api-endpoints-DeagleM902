package com.example.couriersystem.repository;

import com.example.couriersystem.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    //Queries as needed
}
