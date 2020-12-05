package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class vendingMachineInterfaceTest {
    Vendingmachine m = new Vendingmachine();
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void addCurrency() {
        int expected=3;
        int actual=0;

        m.addCurrency(1);
        m.addCurrency(2);
        actual=m.getBalance();

        assertEquals(expected,actual);
    }

    @Test
    public void request() {
        Paradis expected = new Paradis("Paradis", 39);

        Product actual = m.request(2);

        assertEquals(expected,actual);
    }

    @Test
    public void endSession() {
        int expected = 50;

        m.addCurrency(50);
        int actual = m.endSession();

        assertEquals(expected,actual);
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getBalance() {
    }

    @Test
    public void getProducts() {
    }
}