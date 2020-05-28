package com.assignment4.chef;

public class Chef implements ChefInterface{
    private String name;

    public Chef(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeSalad(Salad salad) {
        System.out.println("Salad is ready");
        System.out.println("Total calorie is " + salad.totalCalorie());
        System.out.println("Salad has the next vegetables (order by calorie):");
        salad.showAllVegetables();
    }
}
