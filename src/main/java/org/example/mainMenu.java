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
        System.out.println("1. Put in money");
        System.out.println("2. Buy product");
        System.out.println("3. Quit");
        System.out.println("4. Product description");
        System.out.println("5. Product list");
        System.out.printf("Money in deposition: ");
        System.out.println(""+ amount);
        System.out.println("");




        answer = wFA();
        //System.out.println(answer);
        answerInt = Integer.parseInt(answer);

        return answerInt;
    }
    public String wFA(){
        Scanner scNr1 = new Scanner(System.in);
        answer = scNr1.nextLine(); // holds actual input
        return answer;
    }
}
