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
        System.out.println("1. Quit without buying");
        System.out.println("2. Put in money");
        System.out.println("3. Choose products");
        System.out.println("4. Confirm buy");
        System.out.printf("Money in deposition: ");
        System.out.println(""+ amount);
        System.out.println("");




        answer = wFA();
        System.out.println(answer);
        answerInt = Integer.parseInt(answer);
        System.out.println(answerInt);
        return answerInt;
    }
    public String wFA(){
        Scanner scNr1 = new Scanner(System.in);
        answer = scNr1.nextLine(); // holds actual input
        return answer;
    }
}
