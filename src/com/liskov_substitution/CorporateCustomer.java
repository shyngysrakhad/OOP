package com.liskov_substitution;

public class CorporateCustomer extends Customer implements ISpecialCustomer {
    public CorporateCustomer(String name) {
        super(name);
    }

    @Override
    public String addToDatabase() {
        return "Corporate customer " + this.name +  " added to database";
    }

    @Override
    public String receiveCashBack() {
        return "Corporate customer " + this.name + " received cashBack";
    }
}
