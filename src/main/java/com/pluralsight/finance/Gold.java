package com.pluralsight.finance;

public class Gold extends FixedAsset {
    //attribute
    private double weight;
    //constructor for the Gold class
    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }
    //gettor and setter
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    //method to calculate the value of gold
    @Override
    public double getValue(){
        //return the market value x weight
       return getMarketValue() * weight;
    }
}
