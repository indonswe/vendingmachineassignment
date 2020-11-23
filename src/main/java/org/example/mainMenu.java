package org.example;

import java.util.Scanner;

public class mainMenu {
    boolean quit=false;
    String answer;
    int answerInt;
    public mainMenu (){
    }
    public int pMM(){
        System.out.println("1. Put in money");
        System.out.println("2. Choose products");
        System.out.println("3. Quit");
        answer = wFA();
        answerInt = Integer.parseInt(answer);
        return answerInt;
    }
    public String wFA(){
        Scanner scNr1 = new Scanner(System.in);
        answer = scNr1.nextLine(); // holds actual input
        return answer;
    }
}
