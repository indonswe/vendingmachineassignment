package org.example;

import java.util.Scanner;

public class mainMenu {
    boolean quit=false;
    String answer;
    int answerInt;
    int amount;
    int value;
    public mainMenu (){
    }
    public int pMM(int amount){
        System.out.println("1. Product list");
        System.out.println("2. Product description");
        System.out.println("3. Put in money");
        System.out.println("4. Buy product");
        System.out.println("5. Quit");
        System.out.println("6. Check money slots(admin only)");
        System.out.printf("Money in deposition: ");
        System.out.println(""+ amount);
        System.out.println("");




            answer = wFA(amount);
            //System.out.println(answer);
            answerInt = Integer.parseInt(answer);

        return answerInt;
    }
    public String wFA(int amount){
        if (amount!=99999) {
        Scanner scNr1 = new Scanner(System.in);
        answer = scNr1.nextLine(); // holds actual input
        } else answer = "7";
        return answer;
    }
}
