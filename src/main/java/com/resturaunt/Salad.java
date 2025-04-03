package com.resturaunt;

public class Salad 
{
    //Attributes
    private String veggie;
    private String dressing;
    private double cost;

    public Salad(String veggieType, String dressingType, double mealCost)
    {
        veggie = veggieType;
        dressing = dressingType;
        cost = mealCost;
    }

    public String toString()
    {
        return "You ordered an " + veggie + " salad with " + dressing + ". The salad will cost $" + cost;
    }
}
