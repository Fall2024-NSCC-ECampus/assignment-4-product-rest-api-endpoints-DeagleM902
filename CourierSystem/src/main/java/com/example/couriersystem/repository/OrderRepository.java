package com.example.couriersystem.repository;

import com.example.couriersystem.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    //Queries as needed
}
