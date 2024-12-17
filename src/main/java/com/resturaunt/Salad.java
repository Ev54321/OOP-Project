package com.resturaunt;

public class Salad 
{
    //Attributes
    private String lettuce;
    private String dressing;

    public Salad(String lettuceType, String dressingType)
    {
        lettuce = lettuceType;
        dressing = dressingType;
    }

    public String toString()
    {
        return "You ordered an " + lettuce + " salad with " + dressing;
    }
}
