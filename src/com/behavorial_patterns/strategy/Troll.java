package com.behavorial_patterns.strategy;

public class Troll implements CharacterStrategy, IWalk{

    private String name;
    public Troll(String name){
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
        System.out.println("I am a Troll");
        walk();
    }

    @Override
    public void walk() {
        System.out.println("I can walk");
    }
}
