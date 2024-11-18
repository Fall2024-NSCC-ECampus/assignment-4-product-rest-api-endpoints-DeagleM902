package com.example.couriersystem.service.impl;

import com.example.couriersystem.repository.OrderRepository;
import com.example.couriersystem.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;

    @Override
    public void getOrderDetailById(Long id) {}

    @Override
    public void buyProduct() {}

    @Override
    public void returnProduct() {}
}
