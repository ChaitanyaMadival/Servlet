package com.xworkz.coffeeapp.dto;

import java.io.Serializable;
import java.util.Objects;

public class CoffeeDto implements Serializable,Comparable {
    private String coffeeType;
    private String price;
    private String quantity;
    private String farmer;
    private String location;

    public CoffeeDto(){

    }

    public CoffeeDto(String coffeeType, String price, String quantity, String farmer, String location) {
        this.coffeeType = coffeeType;
        this.price = price;
        this.quantity = quantity;
        this.farmer = farmer;
        this.location = location;
    }

    @Override
    public String toString() {
        return "CoffeeDto{" +
                "coffeeType='" + coffeeType + '\'' +
                ", price='" + price + '\'' +
                ", quantity='" + quantity + '\'' +
                ", farmer='" + farmer + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CoffeeDto coffeeDto = (CoffeeDto) o;
        return Objects.equals(coffeeType, coffeeDto.coffeeType) && Objects.equals(price, coffeeDto.price) && Objects.equals(quantity, coffeeDto.quantity) && Objects.equals(farmer, coffeeDto.farmer) && Objects.equals(location, coffeeDto.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coffeeType, price, quantity, farmer, location);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getFarmer() {
        return farmer;
    }

    public void setFarmer(String farmer) {
        this.farmer = farmer;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
