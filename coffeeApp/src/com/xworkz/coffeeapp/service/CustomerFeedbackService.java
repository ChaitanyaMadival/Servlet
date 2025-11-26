package com.xworkz.coffeeapp.service;

import com.xworkz.coffeeapp.dto.CustomerFeedBackDto;

public interface CustomerFeedbackService {

    void validateAndSave(CustomerFeedBackDto customerFeedBackDto);
}
