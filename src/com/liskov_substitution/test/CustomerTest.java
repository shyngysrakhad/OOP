package com.liskov_substitution.test;

import com.liskov_substitution.CorporateCustomer;
import com.liskov_substitution.IndividualCustomer;
import com.liskov_substitution.Subscriber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    @Test
    public void TestCorporateCustomerDatabase(){
        CorporateCustomer a = new CorporateCustomer("Shyngys");
        assertEquals("Corporate customer Shyngys added to database", a.addToDatabase());
    }
    @Test
    public void TestCustomerCashback(){
        CorporateCustomer a = new CorporateCustomer("Shyngys");
        assertEquals("Corporate customer Shyngys received cashBack", a.receiveCashBack());
    }
    @Test
    public void TestIndividualCustomerDatabase(){
        IndividualCustomer a = new IndividualCustomer("Shyngys");
        assertEquals("Individual customer Shyngys added to database", a.addToDatabase());
    }
    @Test
    public void TestIndividualCustomerCashback(){
        IndividualCustomer a = new IndividualCustomer("Shyngys");
        assertEquals("Individual customer Shyngys received cashback", a.receiveCashBack());
    }
    @Test
    public void TestSubscriberDatabase(){
        Subscriber a = new Subscriber("Shyngys");
        assertEquals("Subscriber Shyngys added to database", a.addToDatabase());
    }
}
