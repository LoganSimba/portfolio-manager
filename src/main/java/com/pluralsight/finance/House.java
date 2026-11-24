package com.pluralsight.finance;

public class House extends FixedAsset{
    //atributes of the house class
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;
    //constructor for he house class
    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }
    //gettors and setters
    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }
    //method to calculate the value of the house
    @Override
    public double getValue(){
        double value = squareFeet * 150;   //$150 per square foot
        value += bedrooms * 10000;          //add $10,000 per every bedroom

        int age = java.time.LocalDate.now().getYear() - yearBuilt;
        value -= age * 1000;                //-1,000 for each year of age

        return value;//return the value
    }

}
