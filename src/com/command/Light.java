package com.command;

public class Light extends Receiver{

    public Light(String name) {
        super(name);
    }

    @Override
    public void on() {
        System.out.println("The light " + getName() + " is on!");
    }

    @Override
    public void off() {
        System.out.println("The light " + getName() + " is off!");
    }
}
