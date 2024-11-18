package com.example.couriersystem.controller;

import com.example.couriersystem.service.CompanyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/companies")
public class CompanyController implements CompanyService {
    @GetMapping
    public void getCompanyDetails() {}
}
