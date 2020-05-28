package com.interface_segregation;

public class Kitchen {
    FryerStation fryerStation = new FryerStation();
    GrillStation grillStation = new GrillStation();

    public void setFryerStation(FryerStation fryerStation) {
        this.fryerStation = fryerStation;
    }

    public void setGrillStation(GrillStation grillStation) {
        this.grillStation = grillStation;
    }

    public Meal cookOrder(Order order) throws Exception {
        if (order.isFryerOrder()){
            return fryerStation.fryMeal();
        }
        else if (order.isGrillOrder()){
            return grillStation.grillMeal();
        }
        else{
            throw new Exception("Cannot make the order!");
        }
    }
}
