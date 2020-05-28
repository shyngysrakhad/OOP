package com.behavorial_patterns.observer;

public class Subscriber implements ISubscriber{
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Magazine m) {
        System.out.println(this.name + " got message " + m.getName());
    }
}
