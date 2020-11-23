package org.example;

import java.util.Scanner;

public class mainMenu {
    boolean quit=false;
    String answer;
    public mainMenu (){
    }
    public void pMM(){
        System.out.println("1. Put in money");
        System.out.println("2. Choose products");
        System.out.println("3. Quit");
        wFA();
    }
    public void wFA(){
        Scanner scNr1 = new Scanner(System.in);
        answer = scNr1.nextLine(); // holds actual input
    }
}
