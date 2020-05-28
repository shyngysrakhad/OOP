package com.interface_segregation;

public class FryerStation implements IFryer{
    @Override
    public Meal fryMeal() {
        return new Meal("Stake");
    }

    @Override
    public void cook() {
        System.out.println("In process: stake");
    }
}
