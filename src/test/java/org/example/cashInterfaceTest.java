package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class cashInterfaceTest {
    Vendingmachine m = new Vendingmachine();
    cashInterface moneyInterface;
    int[] money = new int[10];

    @Before
    public void setUp() throws Exception {
        moneyInterface = new cashInterface();
    }

    @Test
    public void cashInterface() {
        int expected=0;
        int actual;

        actual=moneyInterface.money[7];

        assertEquals(expected,actual);
    }

    @Test
    public void depositMoneySlot() {
        int expected=1;
        int actual;
        int deposit = 50;

        deposit = moneyInterface.depositMoneySlot(deposit);
        actual=moneyInterface.money[5];

        assertEquals(expected,actual);
    }

    @Test
    public void giveMoneyBack() {
        int expected=0;
        int actual;
        int deposit = 50;

        deposit = moneyInterface.depositMoneySlot(deposit);
        moneyInterface.giveMoneyBack(deposit);
        actual=moneyInterface.money[5];

        assertEquals(expected,actual);
    }

    @Test
    public void resetCashInterface() {
        int expected=0;
        int actual;
        int deposit = 50;

        deposit = moneyInterface.depositMoneySlot(deposit);
        moneyInterface.resetCashInterface();
        actual=moneyInterface.money[5];

        assertEquals(expected,actual);
    }

    @Test
    public void cashByUser() {
        int expected=1;
        int actual;
        int deposit = 50;

        deposit = moneyInterface.depositMoneySlot(deposit);
        moneyInterface.cashByUser();
        actual=moneyInterface.money[5];

        assertEquals(expected,actual);
    }
}