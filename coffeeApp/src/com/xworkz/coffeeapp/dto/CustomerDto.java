package com.xworkz.coffeeapp.dto;

import java.util.Objects;

public class CustomerDto {

    private String customerName;
    private String customerNumber;
    private String coffeeFlavour;
    private String quantity;
    private String paymentMode;

    public CustomerDto(){
        System.out.println("No Arg Constructor");
    }

    public CustomerDto(String customerName, String customerNumber, String coffeeFlavour, String quantity, String paymentMode) {
        this.customerName = customerName;
        this.customerNumber = customerNumber;
        this.coffeeFlavour = coffeeFlavour;
        this.quantity = quantity;
        this.paymentMode = paymentMode;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "customerName='" + customerName + '\'' +
                ", customerNumber='" + customerNumber + '\'' +
                ", coffeeFlavour='" + coffeeFlavour + '\'' +
                ", quantity='" + quantity + '\'' +
                ", paymentMode='" + paymentMode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDto that = (CustomerDto) o;
        return Objects.equals(customerName, that.customerName) && Objects.equals(customerNumber, that.customerNumber) && Objects.equals(coffeeFlavour, that.coffeeFlavour) && Objects.equals(quantity, that.quantity) && Objects.equals(paymentMode, that.paymentMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName, customerNumber, coffeeFlavour, quantity, paymentMode);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCoffeeFlavour() {
        return coffeeFlavour;
    }

    public void setCoffeeFlavour(String coffeeFlavour) {
        this.coffeeFlavour = coffeeFlavour;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
}
