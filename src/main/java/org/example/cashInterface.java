package org.example;

public class cashInterface {
    //int money;
    int[] money = new int[9];

    /*public enum money{
        kr1(0),
        kr2(0),
        kr5(0),
        kr10(0),
        kr20(0),
        kr50(0),
        kr100(0),
        kr200(0),
        kr500(0),
        kr1000(0);

        private final int amount;

        money(int amount) {
            this.amount = amount;
        }*/
    public void cashInterface() {
        for(int i=0;i<money.length;i++){
            money[i]=10;
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
                System.out.println("Input error");
                System.out.println("The machine accepts the following denominations:");
                System.out.println("1kr, 2kr, 5kr, 10kr, 20kr, 50kr, 100kr, 200kr, 500kr, 1000kr.");
                System.out.println("Put in the money one at a time followed by enter.");
                return 0;
        }
        return deposit;
    }
    public void giveMoneyBack(int amount) {
        do {
            System.out.println("You will get " + amount + " back. ");
            if (amount > 1000) {
                money[0] = money[0] + 1;
                amount = amount - 1000;
                System.out.println("Machine output 1000kr");
            } else if (amount > 500) {
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
    }
    public void resetCashInterface(){
        for(int i=0;i<money.length;i++){
            money[i]=0;
        }
    }

}

    //public enum money(1)
    //int[]money = new int[]{1,2,5,10,20,50,100,200,500,1000};
    //public int cashInterface(int nr){
    //    return money(nr);
    //}

