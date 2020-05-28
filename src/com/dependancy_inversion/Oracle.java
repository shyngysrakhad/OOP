package com.dependancy_inversion;

public class Oracle implements Database {
    @Override
    public void connect() {
        System.out.println("Oracle is connecting...");
    }

    @Override
    public void disconnect() {
        System.out.println("Oracle is disconnecting...");
    }
}
