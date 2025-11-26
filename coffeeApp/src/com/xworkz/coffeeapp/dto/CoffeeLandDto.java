package com.xworkz.coffeeapp.dto;

import java.util.Objects;

public class CoffeeLandDto {

    private String sizeByAcre;
    private String totalPlant;
    private String totalYield;
    private String expenditure;
    private String profitMade;
    private String fertilizer;

    public CoffeeLandDto(String sizeByAcre, String totalPlant, String totalYield, String expenditure, String profitMade, String fertilizer) {
        this.sizeByAcre = sizeByAcre;
        this.totalPlant = totalPlant;
        this.totalYield = totalYield;
        this.expenditure = expenditure;
        this.profitMade = profitMade;
        this.fertilizer = fertilizer;
    }

    @Override
    public String toString() {
        return "CoffeeLandDto{" +
                "sizeByAcre='" + sizeByAcre + '\'' +
                ", totalPlant='" + totalPlant + '\'' +
                ", totalYield='" + totalYield + '\'' +
                ", expenditure='" + expenditure + '\'' +
                ", profitMade='" + profitMade + '\'' +
                ", fertilizer='" + fertilizer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CoffeeLandDto that = (CoffeeLandDto) o;
        return Objects.equals(sizeByAcre, that.sizeByAcre) && Objects.equals(totalPlant, that.totalPlant) && Objects.equals(totalYield, that.totalYield) && Objects.equals(expenditure, that.expenditure) && Objects.equals(profitMade, that.profitMade) && Objects.equals(fertilizer, that.fertilizer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sizeByAcre, totalPlant, totalYield, expenditure, profitMade, fertilizer);
    }

    public String getSizeByAcre() {
        return sizeByAcre;
    }

    public void setSizeByAcre(String sizeByAcre) {
        this.sizeByAcre = sizeByAcre;
    }

    public String getTotalPlant() {
        return totalPlant;
    }

    public void setTotalPlant(String totalPlant) {
        this.totalPlant = totalPlant;
    }

    public String getTotalYield() {
        return totalYield;
    }

    public void setTotalYield(String totalYield) {
        this.totalYield = totalYield;
    }

    public String getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(String expenditure) {
        this.expenditure = expenditure;
    }

    public String getProfitMade() {
        return profitMade;
    }

    public void setProfitMade(String profitMade) {
        this.profitMade = profitMade;
    }

    public String getFertilizer() {
        return fertilizer;
    }

    public void setFertilizer(String fertilizer) {
        this.fertilizer = fertilizer;
    }
}
