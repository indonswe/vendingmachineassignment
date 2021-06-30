package org.example;

import org.example.Models.Vendingmachine;
import org.example.Sequencers.Productsequencer;
import org.junit.Before;
import org.junit.Test;

public class DrinksTest {

    @Before
    public void setUp() throws Exception {
        Productsequencer.reset();
        Vendingmachine m = new Vendingmachine();
    }

    @Test
    public void examine() {
        /*String expectedStringC = "Cocacola: price 13kr, volume 33 cl, 30 kcal.";
        String expectedStringW = "Water: price 5 kr, volume 5 dl, 0 kcal.";
        String actualC;
        String actualW;
        Cocacola cocacola = new Cocacola("Cocacola", 13);
        Water water = new Water("Water", 5);
        actualC = cocacola.examine();
        actualW = water.examine();
        assertEquals(expectedStringC,actualC);
        assertEquals(expectedStringW,actualW);*/
    }

    @Test
    public void use() {
        /*String expectedString = "You consumed a nice and cold drink";
        String actual;

        Cocacola cocacola = new Cocacola("Cocacola", 13);
        Water water = new Water("Water", 5);
        actual = water.use();


        assertEquals(expectedString,actual);*/
    }
}