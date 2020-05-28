package com.strategy;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context(new Troll("Troll"));
        context.demo();

        context = new Context(new Vampire("Vampire"));
        context.demo();
    }
}
