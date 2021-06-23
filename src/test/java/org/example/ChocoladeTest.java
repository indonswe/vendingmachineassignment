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

        /*String expectedStringSnickers = "Snickers, vikt: 100 gram, pris: 8 kr, kcal: 500.";
        String expectedStringParadis = "Paradis, vikt: 500 gram, pris: 39 kr, kcal: 2500.";
        String actualSnickers;
        String actualParadis;
        Snickers newSnickers = new Snickers("Snickers", 8);
        Paradis paradis = new Paradis("Paradis", 39);
        actualSnickers = newSnickers.examine();
        actualParadis = paradis.examine();
        assertEquals(expectedStringSnickers,actualSnickers);
        assertEquals(expectedStringParadis,actualParadis);*/
    }

    @Test
    public void use() {
        /*String expectedString = "Chocolade empty, congratulations for consuming a massive amounts of calories";
        String actual;

        Snickers newSnickers = new Snickers("Snickers", 8);
        Paradis paradis = new Paradis("Paradis", 39);
        actual = paradis.use();


        assertEquals(expectedString,actual);*/
    }
}