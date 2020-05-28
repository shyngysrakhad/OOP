package com.interface_segregation.test;

import com.interface_segregation.Kitchen;
import com.interface_segregation.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KitchenTest {
    @Test
    public void TestKitchenFry() throws Exception {
        Kitchen k = new Kitchen();
        Order order = new Order(true, false);
        assertEquals("Stake", k.cookOrder(order).getName());
    }

    @Test
    public void TestKitchenGrill() throws Exception {
        Kitchen k = new Kitchen();
        Order order = new Order(false, true);
        assertEquals("Barbeque", k.cookOrder(order).getName());
    }
}
