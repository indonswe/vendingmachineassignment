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
    public void depositMoneySlot(int deposit) {
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
        }
    }
    public void giveMoneyBack(int amount){
    if (amount>)
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
