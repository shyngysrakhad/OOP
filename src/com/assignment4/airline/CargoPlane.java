package com.assignment4.airline;

public class CargoPlane extends Airplane {

    public CargoPlane(String name, double fuelConsumption, double maxLoadCapacity)
    {
        super(name, fuelConsumption, maxLoadCapacity);
    }
    public void fly()
    {
        System.out.println(this.getName() + " is flying!");
    }
    @Override
    public void takeOff() {
        // TODO Auto-generated method stub
        System.out.println(this.getName() + " is taking off!");
    }
    @Override
    public void land() {
        // TODO Auto-generated method stub
        System.out.println(this.getName() + " is landing!");
    }
}
