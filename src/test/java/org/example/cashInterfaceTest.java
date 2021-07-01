package org.example;

import org.example.Models.Cashinterface;
import org.example.Models.Vendingmachine;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class cashInterfaceTest {
    Vendingmachine m = new Vendingmachine();
    Cashinterface moneyInterface = new Cashinterface(10);
    int[] money = moneyInterface.methodForTests();

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void cashInterface() {
        int expected=10;
        int actual;

        actual=money[5];

        assertEquals(expected,actual);
    }

    @Test
    public void depositMoneySlot() {
        int expected=11;
        int actual;
        int deposit = 50;

        deposit = moneyInterface.depositMoneySlot(deposit);
        actual=money[5];

        assertEquals(expected,actual);
    }

    @Test
    public void giveMoneyBack() {
        int expected=0;
        int actual;
        int deposit = 50;

        deposit = moneyInterface.depositMoneySlot(deposit);
        moneyInterface.giveMoneyBack(deposit);
        actual=money[5];

        assertEquals(expected,actual);
    }

    @Test
    public void resetCashInterface() {
        int expected=0;
        int actual;
        int deposit = 50;

        deposit = moneyInterface.depositMoneySlot(deposit);
        moneyInterface.resetCashInterface();
        actual=money[5];

        assertEquals(expected,actual);
    }

    @Test
    public void cashByUser() {
        int expected=11;
        int actual;
        int deposit = 50;

        deposit = moneyInterface.depositMoneySlot(deposit);
        moneyInterface.cashByUser();
        actual=money[5];

        assertEquals(expected,actual);
    }
}