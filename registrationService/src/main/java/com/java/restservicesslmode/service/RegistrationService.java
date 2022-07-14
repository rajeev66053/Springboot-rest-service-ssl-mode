package com.java.restservicesslmode.service;

import com.java.restservicesslmode.dto.Seller;

import java.util.List;

public interface RegistrationService {

    String addSeller(Seller seller);

    List<Seller> getSellersList();
}