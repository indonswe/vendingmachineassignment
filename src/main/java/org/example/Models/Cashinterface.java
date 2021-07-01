package org.example.Models;

import org.example.Data.Cashrepresentation;

public class Cashinterface {
    int spaceForMoney;
    int[] money = new int[10];

    public Cashinterface(int spaceForMoney) {
        this.spaceForMoney = spaceForMoney;
        for(int i=0;i<money.length;i++){
            money[i]=spaceForMoney;
        }
        System.out.println("Each money slot is loaded with 10 bills/coins");
    }

    public void cashInterface() {
        for(int i=0;i<money.length;i++){
            money[i]=spaceForMoney;

        }
    }
    public int depositMoneySlot(int deposit) {

        switch (deposit) {
            case 1:
                money[0] = money[0] + 1;
                break;
            case 2:
                money[1] = money[1] + 1;
                break;
            case 5:
                money[2] = money[2] + 1;
                break;
            case 10:
                money[3] = money[3] + 1;
                break;
            case 20:
                money[4] = money[4] + 1;
                break;
            case 50:
                money[5] = money[5] + 1;
                break;
            case 100:
                money[6] = money[6] + 1;
                break;
            case 200:
                money[7] = money[7] + 1;
                break;
            case 500:
                money[8] = money[8] + 1;
                break;
            case 1000:
                money[9] = money[9] + 1;
                break;
            default:

                System.out.println("The machine accepts the following denominations:");
                System.out.println("1kr, 2kr, 5kr, 10kr, 20kr, 50kr, 100kr, 200kr, 500kr, 1000kr.");
                System.out.println("Put in the money one at a time!");

                return 0;
        }
        return deposit;
    }
    public void giveMoneyBack(int amount) {
        do {

            if (amount > 999) {
                money[0] = money[0] - 1;
                amount = amount - 1000;
                System.out.println("Machine output 1000kr");
            } else if (amount > 499) {
                money[8] = money[8] - 1;
                amount = amount - 500;
                System.out.println("Machine output 500kr");
            } else if (amount > 199) {
                money[7] = money[7] - 1;
                amount = amount - 200;
                System.out.println("Machine output 200kr");
            } else if (amount > 99) {
                money[6] = money[6] - 1;
                amount = amount - 100;
                System.out.println("Machine output 100kr");
            } else if (amount > 49) {
                money[5] = money[5] - 1;
                amount = amount - 50;
                System.out.println("Machine output 50kr");
            } else if (amount > 19) {
                money[4] = money[4] - 1;
                amount = amount - 20;
                System.out.println("Machine output 20kr");
            } else if (amount > 9) {
                money[3] = money[3] - 1;
                amount = amount - 10;
                System.out.println("Machine output 10kr");
            } else if (amount > 4) {
                money[2] = money[2] - 1;
                amount = amount - 5;
                System.out.println("Machine output 5kr");
            } else if (amount > 1) {
                money[1] = money[1] - 1;
                amount = amount - 2;
                System.out.println("Machine output 2kr");
            } else if (amount > 0) {
                money[0] = money[0] - 1;
                amount = amount - 1;
                System.out.println("Machine output 1kr");
            }
        } while (amount > 0);
        resetCashInterface();
    }
    public void resetCashInterface(){
        for(int i=0;i<money.length;i++){
            money[i]=0;
        }
    }
    public void cashByUser(){
        int i=-1;
        System.out.println("Amount of money in each money slot");
        for(Cashrepresentation slots: Cashrepresentation.values()) {
            ++i;
            System.out.println(slots + ": "+ money[i]);
        }
    }
    public int[] methodForTests(){
        return money;
    }

}



