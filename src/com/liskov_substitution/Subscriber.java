package com.liskov_substitution;

public class Subscriber extends Customer{
    public Subscriber(String name) {
        super(name);
    }

    @Override
    public String addToDatabase() {
        return "Subscriber " + this.name + " added to database";
    }
}
