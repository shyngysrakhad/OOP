package com.factoryMethod;

public class Main {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new CppDeveloperFactory();
        Developer cppDev = developerFactory.createDeveloper();

        developerFactory = new JavaDeveloperFactory();
        Developer javaDev = developerFactory.createDeveloper();

        cppDev.writeCode();
        javaDev.writeCode();
    }
}
