package com.assignment4.airline;

public class PassengerPlane extends Airplane{

    public PassengerPlane(String name, double fuelConsumption, int maxCustCapacity)
    {
        super(name, fuelConsumption, maxCustCapacity);
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
