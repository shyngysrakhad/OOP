package com.assignment4.chef;

public class Vegetable implements VegetableInterface, Comparable<Vegetable>{
    private String name;
    private Integer calorie;

    public Vegetable(String name, int calorie) {
        this.name = name;
        this.calorie = calorie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    @Override
    public void about() {
        System.out.println("It is " + this.name + ". Calorie: " + this.calorie);
    }

    @Override
    public int compareTo(Vegetable o) {
        if (getCalorie() == 0)
            return 0;
        return getCalorie().compareTo(o.getCalorie());
    }
}
