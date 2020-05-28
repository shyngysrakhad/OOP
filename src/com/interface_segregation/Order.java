package com.interface_segregation;

public class Order {
    boolean isFryerOrder;
    boolean isGrillOrder;
    public Order(boolean isFryerOrder, boolean isGrillOrder){
        this.isGrillOrder = isGrillOrder;
        this.isFryerOrder = isFryerOrder;
    }
    public boolean isFryerOrder() {
        return isFryerOrder;
    }

    public void setFryerOrder(boolean fryerOrder) {
        isFryerOrder = fryerOrder;
    }

    public boolean isGrillOrder() {
        return isGrillOrder;
    }

    public void setGrillOrder(boolean grillOrder) {
        isGrillOrder = grillOrder;
    }
}
