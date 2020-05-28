package com.behavorial_patterns.command;

public abstract class Receiver {
    private String name;

    public Receiver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void on();
    public abstract void off();
}
