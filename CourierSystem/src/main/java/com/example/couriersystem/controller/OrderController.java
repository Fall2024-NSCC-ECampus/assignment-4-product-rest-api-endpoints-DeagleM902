package com.example.couriersystem.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/{id}")
    public void getOrderDetailById(@PathVariable Long id) {}

    @PostMapping("/buy")
    public void buyProduct() {}

    @PostMapping("/return")
    public void returnProduct() {}
}
