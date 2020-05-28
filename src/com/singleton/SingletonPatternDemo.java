package com.singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance(2);
        System.out.println(singleObject.getValue());

        SingleObject second = SingleObject.getInstance(3);
        System.out.println(second);
    }

}