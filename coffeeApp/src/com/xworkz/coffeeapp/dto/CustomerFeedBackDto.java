package com.xworkz.coffeeapp.dto;

import java.util.Objects;

public class CustomerFeedBackDto {
    private String customerName;
    private String email;
    private String comment;
    private String rating;

    public CustomerFeedBackDto(String customerName, String email, String comment, String rating) {
        this.customerName = customerName;
        this.email = email;
        this.comment = comment;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "CustomerFeedBackDto{" +
                "customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", comment='" + comment + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CustomerFeedBackDto that = (CustomerFeedBackDto) o;
        return Objects.equals(customerName, that.customerName) && Objects.equals(email, that.email) && Objects.equals(comment, that.comment) && Objects.equals(rating, that.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName, email, comment, rating);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
