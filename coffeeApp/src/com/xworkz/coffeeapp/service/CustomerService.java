package com.xworkz.coffeeapp.service;

import com.xworkz.coffeeapp.dto.CustomerDto;
import com.xworkz.coffeeapp.dto.CustomerFeedBackDto;

public interface CustomerService {

    void validateAndSave(CustomerDto customerDto);
}
