package com.assignment4.chef;

public interface SaladInterface {
    void showAllVegetables();
    void addVegetable(Vegetable vegetable);
    int totalCalorie();
    Vegetable found(int minCalorie, int maxCalorie);
}
