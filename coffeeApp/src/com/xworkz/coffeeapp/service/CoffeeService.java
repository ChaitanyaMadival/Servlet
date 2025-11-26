package com.xworkz.coffeeapp.service;

import com.xworkz.coffeeapp.dto.CoffeeDto;

public interface CoffeeService {

    void validateAndSave(CoffeeDto coffeeDto);

}
