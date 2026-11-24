package com.pluralsight.finance;

public class Jewelry extends FixedAsset{
    //attributes for jewerly class
    private double karat;
    //constructor for the jewerly class
    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }
    //method to get the value of gold and the calculations
    @Override
    public double getValue(){
        return getMarketValue() * (karat/24);
    }
}
