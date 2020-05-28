package com.interface_segregation;

public class GrillStation implements IGrill{
    @Override
    public Meal grillMeal() {
        return new Meal("Barbeque");
    }
    @Override
    public void cook() {
        System.out.println("In process: barbeque");
    }
}
