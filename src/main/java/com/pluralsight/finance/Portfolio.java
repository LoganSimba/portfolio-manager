package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    //attributes
    private String name;
    private String owner;
    private List<Valuable> assets;

    //constructor for portfolio
    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public void add(Valuable asset) {
        assets.add(asset);
    }

    public double getValue() {

        double totalValue = 0;
        for (Valuable asset : assets) {
            totalValue += asset.getValue();
        }
        return totalValue;
    }

    //method to get most valuable
    public Valuable getMostValuable() {
        //check if our list contains anything
        if (assets.isEmpty()) {
            return null;
        }

        //initialize most valuable witht the first element in the arraylist
        Valuable mostValuable = assets.get(0);
        //iterate throught the arralyist , if an asset is greater in value than our first then update
        for (Valuable asset : assets) {
            if (mostValuable.getValue() < asset.getValue()) {
                mostValuable = asset;
            }
        }
        return mostValuable;
    }

    //method least valuable item
    public Valuable getLeastValuable() {
        //check if our list contains anything
        if (assets.isEmpty()) {
            return null;
        }
        //initialize the least valuable character to the first element in the arraylist
        Valuable leastValuable = assets.get(0);
        //iterate through the list, if any item has lower value, update the leastValuable
        for (Valuable asset : assets) {
            if (leastValuable.getValue() > asset.getValue()) {
                leastValuable = asset;
            }
        }
        return leastValuable;//return the least valuable item
    }
}
