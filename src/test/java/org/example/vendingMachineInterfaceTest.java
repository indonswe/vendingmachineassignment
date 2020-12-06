package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class vendingMachineInterfaceTest {
    Vendingmachine m = new Vendingmachine();
    @Before
    public void setUp() throws Exception {
        Productsequencer.reset();
        //Vendingmachine m = new Vendingmachine();

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
        String expectedS = "Paradis";
        int expectedIA = 39;
        int expectedId = 2;

        Product actual = m.request(2);

        assertEquals(expectedIA,actual.amount);
        assertEquals(expectedS,actual.name);
        assertEquals(expectedId,actual.productId);
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
        Paradis expected = new Paradis("Paradis", 39);

        Product actual = m.request(2);

        assertEquals(expected.examine,actual.examine);

    }

    @Test
    public void getBalance() {
        int expected = 500;
        int actual = 0;

        m.addCurrency(500);
        actual=m.getBalance();

        assertEquals(expected, actual);

    }

    @Test
    public void getProducts() {
        int expected = 6;
        int actual;

        String[] getProducts = m.getProducts();
        actual = getProducts.length;

        assertEquals(expected,actual);
    }
}