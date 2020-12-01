package org.example;

public class cashInterface {
    //int money;
    public enum money{
        kr1(0);

        private final int amount;

        money(int amount) {
            this.amount = amount;
        }
    }

    //public enum money(1)
    //int[]money = new int[]{1,2,5,10,20,50,100,200,500,1000};
    //public int cashInterface(int nr){
    //    return money(nr);
    //}
}
