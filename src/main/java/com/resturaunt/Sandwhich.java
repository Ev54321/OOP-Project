package com.resturaunt;

public class Sandwhich {
    //Attributes
    private String bread;
    private String meat;
    private String veggies;
    private String side;
    private double cost;

    public Sandwhich(String breadType, String meats, String veggieType, String sides, double sandwhichCost)
    {
        bread = breadType;
        meat = meats;
        veggies = veggieType;
        side = sides;
        cost = sandwhichCost;
    }

    public String toString()
    {
        return "You ordered a " + bread + " sandwhich with " + meat + ", " + veggies + " and a side of " + side + ". The sandwhich costs $" + cost; 
    }
}
