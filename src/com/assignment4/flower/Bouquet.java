package com.assignment4.flower;

import java.util.ArrayList;
import java.util.Collections;

public class Bouquet implements BouquetInterface {
    private int capacity;
    private int maxLength;
    private int maxPrice;
    private String color;
    private ArrayList<Flower> flowers;

    public Bouquet(int capacity, int maxLength, String color, int maxPrice) {
        this.capacity = capacity;
        this.maxLength = maxLength;
        this.color = color;
        this.maxPrice = maxPrice;
        flowers = new ArrayList<>();
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void showAllFlowers() {
        Collections.sort(flowers);
        Collections.reverse(flowers);
        for (Flower flower : flowers) {
            System.out.println(flower.getName());
        }
    }


    @Override
    public void addFlower(Flower flower) {
        if (flowers.size() < capacity){
            if (flower.getLength() <= this.maxLength || flower.getPrice() > this.maxPrice){
                System.out.println(flower.getName() + " is successfully added");
                flowers.add(flower);
            }
            else{
                System.out.println(flower.getName() + " is incompatible");
            }
        }else
            System.out.println("The bouquet is filled");
    }

    @Override
    public int totalPrice() {
        int total = 0;
        for (Flower flower : flowers) {
            total += flower.getPrice();
        }
        return total;
    }

    @Override
    public Flower found(int minLength, int maxLength) {
        for (Flower flower : flowers)
            if (flower.getLength() >= minLength && flower.getLength() <= maxLength)
                return flower;
        return null;
    }
}
