package com.assignment4.chef;

import java.util.ArrayList;
import java.util.Collections;

public class Salad implements SaladInterface{

    private String name;
    private int maxCalorie;
    private ArrayList<Vegetable> vegetables;

    public Salad(String name, int maxCalorie) {
        this.name = name;
        this.maxCalorie = maxCalorie;
        this.vegetables = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCalorie() {
        return maxCalorie;
    }

    public void setMaxCalorie(int maxCalorie) {
        this.maxCalorie = maxCalorie;
    }

    public ArrayList<Vegetable> getVegetables() {
        return vegetables;
    }

    public void setVegetables(ArrayList<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }

    @Override
    public void showAllVegetables() {
        Collections.sort(vegetables);
        Collections.reverse(vegetables);
        for (Vegetable vegetable : vegetables){
            System.out.println(vegetable.getName());
        }
    }

    @Override
    public void addVegetable(Vegetable vegetable) {
        if (totalCalorie() + vegetable.getCalorie() < maxCalorie){
            vegetables.add(vegetable);
            System.out.println(vegetable.getName() + " is added successfully");
        }else
            System.out.println(vegetable.getName() + " is incompatible");
    }

    @Override
    public int totalCalorie() {
        int total = 0;
        for (Vegetable vegetable : vegetables)
            total += vegetable.getCalorie();
        return total;
    }

    @Override
    public Vegetable found(int minCalorie, int maxCalorie) {
        for (Vegetable vegetable : vegetables)
            if (vegetable.getCalorie() >= minCalorie && vegetable.getCalorie() <= maxCalorie)
                return vegetable;
        return null;
    }
}
