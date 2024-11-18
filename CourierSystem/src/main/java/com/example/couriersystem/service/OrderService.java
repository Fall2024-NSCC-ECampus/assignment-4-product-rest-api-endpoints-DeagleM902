package com.example.couriersystem.service;

public interface OrderService {
    //Change return types to relevant type
    void getOrderDetailById(Long id);
    void buyProduct();
    void returnProduct();
}
