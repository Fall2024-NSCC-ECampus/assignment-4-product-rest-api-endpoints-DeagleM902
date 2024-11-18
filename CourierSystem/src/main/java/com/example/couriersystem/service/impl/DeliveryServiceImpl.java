package com.example.couriersystem.service.impl;

import com.example.couriersystem.repository.DeliveryRepository;
import com.example.couriersystem.repository.NonDeliveryRepository;
import com.example.couriersystem.service.DeliveryService;
import org.springframework.stereotype.Service;

@Service
public class DeliveryServiceImpl implements DeliveryService {
    private DeliveryRepository deliveryRepository;
    private NonDeliveryRepository nonDeliveryRepository;

    @Override
    public void getDeliveryDetails() {}

    @Override
    public void getNonDeliveryDetails() {}
}
