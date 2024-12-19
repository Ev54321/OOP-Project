package com.resturaunt;

public class Salad 
{
    //Attributes
    private String lettuce;
    private String dressing;
    private double cost;

    public Salad(String lettuceType, String dressingType, double mealCost)
    {
        lettuce = lettuceType;
        dressing = dressingType;
        cost = mealCost;
    }

    public String toString()
    {
        return "You ordered an " + lettuce + " salad with " + dressing + ". The salad will cost $" + cost;
    }
}
