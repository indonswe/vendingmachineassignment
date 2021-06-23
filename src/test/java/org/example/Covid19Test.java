package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Covid19Test {

    @Before
    public void setUp() throws Exception {
        Productsequencer.reset();
        Vendingmachine m = new Vendingmachine();
    }

    @Test
    public void examine() {
        /*String expectedStringZ = "Zinc: price 50 kr, kill virus if you can get it into the cells";
        String expectedStringQ = "Quercetin: price 300 kr, helps Zinc getting into virus cells";
        String actualZ;
        String actualQ;
        Zinc zinc = new Zinc("Zinc", 50);
        Quercetin quercetin = new Quercetin("Quercetin", 300);
        actualZ = zinc.examine();
        actualQ = quercetin.examine();
        assertEquals(expectedStringZ,actualZ);
        assertEquals(expectedStringQ,actualQ);*/
    }

    @Test
    public void use() {
        /*String expectedString = "You consumed a virus killer";
        String actual;

        Zinc zinc = new Zinc("Zinc", 50);
        Quercetin quercetin = new Quercetin("Quercetin", 300);
        actual = zinc.use();


        assertEquals(expectedString,actual);*/
    }

}