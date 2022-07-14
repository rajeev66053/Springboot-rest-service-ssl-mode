package com.java.ordermanagementapp.service;

import com.java.ordermanagementapp.dto.Seller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {
    Logger logger = LoggerFactory.getLogger(UserRegistrationServiceImpl.class);
    private RestTemplate restTemplate;

    public UserRegistrationServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String registerSeller(Seller seller) {
        String response = restTemplate.postForObject("https://localhost:8086/registration/addSeller", seller, String.class);
        return response;
    }

    public List<Seller> getSellersList() {
        return restTemplate.getForObject("https://localhost:8086/registration/sellersList", List.class);
    }
}