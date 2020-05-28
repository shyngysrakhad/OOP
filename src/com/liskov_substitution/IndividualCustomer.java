package com.liskov_substitution;

public class IndividualCustomer extends Customer implements ISpecialCustomer {
    public IndividualCustomer(String name) {
        super(name);
    }

    @Override
    public String addToDatabase() {
        return "Individual customer " + this.name + " added to database";
    }

    @Override
    public String receiveCashBack() {
        return "Individual customer " + this.name + " received cashback";
    }
}
