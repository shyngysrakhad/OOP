package com.assignment4.airline;

import java.util.ArrayList;

public class Airline {
    private String name;
    private Airplane[] airplanes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Airplane[] getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(Airplane[] airplanes) {
        this.airplanes = airplanes;
    }

    public Airline(String name)
    {
        this.setName(name);
    }


    public ArrayList<Airplane> getEfficientAirplane(double fuelConsumption)
    {
        ArrayList<Airplane> result = new ArrayList<Airplane>();
        for (Airplane ap : airplanes) {
            if (ap.getFuelConsumption() < fuelConsumption) {
                result.add(ap);
            }
        }
        return result;
    }
}
