package com.behavorial_patterns.strategy;

public class Vampire implements CharacterStrategy, IWalk, IFly{
    private String name;

    public Vampire(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void execute() {
        System.out.println("I am a Vampire");
        fly();
        walk();
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void walk() {
        System.out.println("I can walk");
    }
}
