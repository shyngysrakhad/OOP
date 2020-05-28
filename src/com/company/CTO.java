package com.company;

public class CTO extends Employee{

    private int programmer_count;

    public CTO(String name, int salary, String status, int programmer_count) {
        super(name, salary, status);
        this.programmer_count = programmer_count;
    }

    public int getProgrammer_count() {
        return programmer_count;
    }

    public void setProgrammer_count(int programmer_count) {
        this.programmer_count = programmer_count;
    }

    @Override
    public void work(){
        super.work();
        System.out.println("I am technical director of the company");
    }

    @Override
    public String say(){
        return super.say() + ". I am CTO";
    }



}
