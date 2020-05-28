package com.singleton;

public class SingleObject {
    static SingleObject instance;
    private int value;
    private SingleObject(int value){
        this.value = value;
    }
    public static SingleObject getInstance(int value){
        if (instance == null){
            instance = new SingleObject(value);
        }
        return instance;
    }

    public int getValue() {
        return value;
    }
}
