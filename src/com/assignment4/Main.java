package com.assignment4;

import com.assignment4.airline.Airline;
import com.assignment4.airline.Airplane;
import com.assignment4.airline.CargoPlane;
import com.assignment4.airline.PassengerPlane;
import com.assignment4.chef.Chef;
import com.assignment4.chef.Salad;
import com.assignment4.chef.Vegetable;
import com.assignment4.flower.Bouquet;
import com.assignment4.flower.Flower;
import com.assignment4.flower.FlowerGirl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
        System.out.println("_____Task 1_____");

        Airline airline = new Airline("Air Astana");
        Airplane[] airplanes = new Airplane[3];

        airplanes[0] = new CargoPlane("AN", 1000, 500);
        airplanes[1] = new CargoPlane("MIG", 800, 400);
        airplanes[2] = new PassengerPlane("BOEING", 400, 150);

        airplanes[0].setLoad(500);
        airplanes[1].setLoad(400);
        airplanes[2].setLoad(190);

        airline.setAirplanes(airplanes);
        ArrayList<Airplane> efficientAirplanes = airline.getEfficientAirplane(450);

        for (Airplane airplane : efficientAirplanes) {
            System.out.println(airplane.getName() + "'s fuel consumption is " + airplane.getFuelConsumption());
        }

        airline.getAirplanes()[0].takeOff();
        airline.getAirplanes()[0].fly();
        airline.getAirplanes()[0].land();

        System.out.println("_____Task 2_____");

        FlowerGirl natasha = new FlowerGirl("Natasha");
        Flower peony = new Flower("Peony", 10, 90, 2000);
        Flower rose = new Flower("Rose", 14, 80, 500);
        Flower tulip = new Flower("Tulip", 17, 85, 1000);
        Bouquet gold = new Bouquet(3, 20, "gold", 5000);
        gold.addFlower(rose);
        gold.addFlower(peony);
        gold.addFlower(tulip);
        Flower flower = gold.found(9, 15);
        natasha.pickUpBouquet(gold);
        try {
            System.out.println(flower.getName());
        }catch (NullPointerException ex){
            System.out.println("Flower does not exist");
        }

        System.out.println("_____Task 3_____");

        Chef shyngys = new Chef("Shyngys");
        Vegetable fennel = new Vegetable("Fennel", 600);
        Vegetable tomato = new Vegetable("Tomato", 300);
        Vegetable carrot = new Vegetable("Carrot", 400);
        Vegetable cucumber = new Vegetable("Cucumber", 200);
        Salad fresh = new Salad("Fresh", 1000);
        fresh.addVegetable(tomato);
        fresh.addVegetable(cucumber);
        fresh.addVegetable(fennel);
        shyngys.makeSalad(fresh);
        Vegetable vegetable = fresh.found(300, 600);
        try {
            System.out.println(vegetable.getName());
        }catch (NullPointerException ex){
            System.out.println("Vegetable does not exist");
        }*/
    public static void main(String[] args) {
        int[] a = {2, 3, 4};
        int k = 5;
        f(a, k);
        System.out.println(k);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
    public static void f(int[] a, int m)
    {
        double[] b = f(a, 6.0);
        a[0] = a[0] * m;
        a[2] = (int) (b[0] + b[1]);
        m = m + 5;
    }
    public static double[] f(int[] a, double x)
    {
        double[] b = new double[2];
        b[0] = a[0] + x;
        b[1] = a[1] + x;
        return b;
    }
}
