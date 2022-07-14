package com.java.ordermanagementapp.service;

import com.java.ordermanagementapp.dto.Seller;

import java.util.List;

public interface UserRegistrationService {
    String registerSeller(Seller seller);

    List<Seller> getSellersList();
}