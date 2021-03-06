package com.java.restservicesslmode.repository;


import com.java.restservicesslmode.dto.Seller;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RegistrationRepository {

    List<Seller> sellerDtoList = new ArrayList<>();

    public boolean addSeller(Seller seller) {

        return sellerDtoList.add(seller);
    }

    public List<Seller> getSellerList() {
        return sellerDtoList;
    }
}