package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class mainMenuTest {

    Vendingmachine m = new Vendingmachine();

    mainMenu pMM = new mainMenu();// handle main menu

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void pMM() {
        int expected = 7;
        int amount = 99999;
        int actual=0;

        actual = pMM.pMM(amount);

        assertEquals(expected,actual);




    }

    @Test
    public void wFA() {

    }
}