package com.java.ordermanagementapp.controller;

import com.java.ordermanagementapp.dto.Seller;
import com.java.ordermanagementapp.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRegistrationController {

    @Autowired
    private UserRegistrationService userRegistrationService;

    @PostMapping("/register/seller")
    public String registerAsSeller(@RequestBody Seller seller) {
        return userRegistrationService.registerSeller(seller);
    }

    @GetMapping("/sellerList")
    public List<Seller> getSellersList() {
        return userRegistrationService.getSellersList();
    }
}