package com.assignment4.flower;


public class FlowerGirl implements FlowerGirlInterface{
    private String name;

    public FlowerGirl(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void pickUpBouquet(Bouquet bouquet) {
        System.out.println("Your bouquet is ready");
        System.out.println("The color is " + bouquet.getColor());
        System.out.println("Total price of the bouquet is " + bouquet.totalPrice());
        System.out.println("The bouquet has the following flowers (order by freshness):");
        bouquet.showAllFlowers();
    }
}
