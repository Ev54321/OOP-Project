package com.resturaunt;

public class totalProfits {
    private int customer;
    private double mealCost;

    public totalProfits(int amountCustomer, double totalmealCost)
    {
        customer = amountCustomer;
        mealCost = totalmealCost;

    }
    
    public String toString()
    {
        return "Today we had " + customer + " customers and made " + mealCost*customer + "$";
    }
}
