package com.resturaunt;

public class Drink {
    private boolean isCarbonated = true;
    private boolean isNotCarbonated = false;
    private String Brand;
    private double drinkCost;

    public Drink(boolean drinkCarbonated, boolean drinkNotCarbonated, String drinkBrand, double Cost)
    {
        isCarbonated = drinkCarbonated;
        isNotCarbonated = drinkNotCarbonated;
        Brand = drinkBrand;
        drinkCost = Cost;
    }

    public String toString()
    {
        return "Did you  order a corbonated drink? " + isCarbonated + ". You ordered a " + Brand + ". The drink will cost $" + drinkCost;
    }
}

