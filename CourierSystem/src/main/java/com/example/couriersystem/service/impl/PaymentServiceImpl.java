package com.example.couriersystem.service.impl;

import com.example.couriersystem.repository.PaymentRepository;
import com.example.couriersystem.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    private PaymentRepository paymentRepository;

    @Override
    public void processPayment() {}
}
