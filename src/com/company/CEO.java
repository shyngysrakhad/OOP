package com.company;

public class CEO extends Employee{
    private String date;


    public CEO(String name, int salary, String status, String date) {
        super(name, salary, status);

        this.date = date;

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public void work(){
        System.out.println("I am boss!");
    }

    @Override
    public String say(){
        return super.say() + ". I am CEO!";
    }

}
