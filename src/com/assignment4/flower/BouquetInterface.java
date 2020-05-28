package com.assignment4.flower;

import java.util.ArrayList;

public interface BouquetInterface {
    void showAllFlowers();
    void addFlower(Flower flower);
    int totalPrice();
    Flower found(int minLength, int maxLength);
}
