package com.xworkz.coffeeapp.dto;

import com.sun.xml.internal.ws.developer.Serialization;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Objects;

public class CafeteriaDto implements Serializable, Comparable {

    private String name;
    private String location;
    private String type;
    private String price;
    private String franchise;
    private String owner;
    private String gst;


    public CafeteriaDto(){
        System.out.println("Using no arg const");
    }

    public CafeteriaDto(String name, String location, String type, String price, String franchise, String owner, String gst) {
        this.name = name;
        this.location = location;
        this.type = type;
        this.price = price;
        this.franchise = franchise;
        this.owner = owner;
        this.gst = gst;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getFranchise() {
        return franchise;
    }

    public void setFranchise(String franchise) {
        this.franchise = franchise;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    @Override
    public String toString() {
        return "CafeteriaDto{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", franchise='" + franchise + '\'' +
                ", owner='" + owner + '\'' +
                ", gst='" + gst + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CafeteriaDto that = (CafeteriaDto) o;
        return Objects.equals(name, that.name) && Objects.equals(location, that.location) && Objects.equals(type, that.type) && Objects.equals(price, that.price) && Objects.equals(franchise, that.franchise) && Objects.equals(owner, that.owner) && Objects.equals(gst, that.gst);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, type, price, franchise, owner, gst);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }


}
