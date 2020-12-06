package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductsequencerTest {

    @Before
    public void setUp() throws Exception {
        Productsequencer.reset();
        Vendingmachine m = new Vendingmachine();
    }

    @Test
    public void nextProductId() {

        int expectedId = 8;
        int actual;


        Quercetin quercetin = new Quercetin("Quercetin", 300);
        actual = Productsequencer.nextProductId();


        assertEquals(expectedId,actual);

    }

    @Test
    public void reset() {
        int expectedId = 1;
        int actual;

        Productsequencer.reset();
        Quercetin quercetin = new Quercetin("Quercetin", 300);
        actual = Productsequencer.nextProductId();

        assertEquals(expectedId,actual);
    }
}