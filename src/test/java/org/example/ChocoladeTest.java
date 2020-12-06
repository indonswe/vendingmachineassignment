package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChocoladeTest {

    @Before
    public void setUp() throws Exception {
        Productsequencer.reset();
        Vendingmachine m = new Vendingmachine();
    }

    @Test
    public void examine() {
        String expectedString = "Paradis, vikt: 500 gram, pris: 39 kr, kcal: 2500.";
        String actual;

        Paradis paradis = new Paradis("Paradis", 39);
        actual = paradis.examine();


        assertEquals(expectedString,actual);
    }

    @Test
    public void use() {
        String expectedString = "Chocolade empty, congratulations for consuming a massive amounts of calories";
        String actual;

        Paradis paradis = new Paradis("Paradis", 39);
        actual = paradis.use();


        assertEquals(expectedString,actual);
    }
}