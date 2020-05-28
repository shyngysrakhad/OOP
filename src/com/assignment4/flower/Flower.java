package com.assignment4.flower;

public class Flower implements FlowerInterface, Comparable<Flower>{
    private String name;
    private int length;
    private Integer freshnessLevel;
    private int price;

    public Flower(String name, int length, int freshnessLevel, int price) {
        this.name = name;
        this.length = length;
        this.freshnessLevel = freshnessLevel;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getFreshnessLevel() {
        return freshnessLevel;
    }

    public void setFreshnessLevel(int freshnessLevel) {
        this.freshnessLevel = freshnessLevel;
    }

    @Override
    public void smell(int days) {
        System.out.println(this.name + " smells about " + days + " days");
    }

    @Override
    public int compareTo(Flower o) {
        if (getFreshnessLevel() == 0)
            return 0;
        return freshnessLevel.compareTo(o.getFreshnessLevel());
    }
}
