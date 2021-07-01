package org.example;

import org.example.Models.Mainmenu;
import org.example.Models.Vendingmachine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class mainMenuTest {

    Vendingmachine m = new Vendingmachine();

    Mainmenu pMM = new Mainmenu();// handle main menu

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void pMM() {
        int expected = 7;
        int amount = 99999;
        int actual=0;

        actual = pMM.menuPrintOut(amount);

        assertEquals(expected,actual);

    }

    @Test
    public void wFA() {

    }
}