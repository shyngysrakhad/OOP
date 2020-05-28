package com.assignment4.airline;

public abstract class Airplane {
    private String name;
    private double fuelConsumption;
    private double load;
    private double maxCapacity;

    Airplane(){
        this.setName("Some plane");
    }
    Airplane(String name, double fuelConsumption, double maxCapacity){
        this.setName(name);
        this.setFuelConsumption(fuelConsumption);
        this.setMaxCapacity(maxCapacity);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getFuelConsumption(){
        return fuelConsumption;
    }
    public void setFuelConsumption(double fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }
    public void setMaxCapacity(double maxCapacity){
        this.maxCapacity = maxCapacity;
    }
    public double getMaxCapacity(){
        return maxCapacity;
    }
    public void setLoad(double load) {
        if (load <= this.getMaxCapacity()) {
            this.load = load;
            System.out.println(this.getName() + " has loaded!");
        }
        else {
            System.out.println(this.getName() + " overloaded!");
        }
    }
    public double getLoad() {
        return load;
    }
    public abstract void takeOff();
    public abstract void land();
    public abstract void fly();
}
