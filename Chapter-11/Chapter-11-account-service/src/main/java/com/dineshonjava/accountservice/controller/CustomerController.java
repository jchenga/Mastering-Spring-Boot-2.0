package com.dineshonjava.accountservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/customer/name")
    public String customerName() {
        return "Jack Cheng";
    }

    @PostMapping("/customer/name")
    public String addCustomerName(String customerName) {
        return "Jack Cheng ...";
    }
}
