package com.resturaunt;

public class Bill {
    private int Customer;
    private double mealCost;
    private double Tip;
    private String Id;

    public Bill(int amountCustomer, double Meal, double waiterTip, String customerId)
    {
        Customer = amountCustomer;
        mealCost = Meal;
        Tip = waiterTip;
        Id = customerId;

    }
    
    public String toString()
    {
        return "Your Id is  required to confirm purchase. " + "Thank you " +  Id + ", your bill came out to be " + Customer*mealCost + "$ plus tip " + Tip + "$ Your total is $" + (Customer*mealCost + Tip);
    }
}
