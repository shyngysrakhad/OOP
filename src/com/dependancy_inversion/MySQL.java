package com.dependancy_inversion;

public class MySQL implements Database {
    @Override
    public void connect() {
        System.out.println("MySQL is connecting...");
    }

    @Override
    public void disconnect() {
        System.out.println("MySQL is disconnecting...");
    }
}
