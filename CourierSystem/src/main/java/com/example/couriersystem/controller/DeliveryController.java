package com.example.couriersystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
    @GetMapping("/details")
    public void getDeliveryDetails() {}

    @GetMapping("/non-delivery")
    public void getNonDeliveryDetails() {}
}
