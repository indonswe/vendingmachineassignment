package org.example;

import java.util.Scanner;

public class Mainmenu {

    String answer;
    int answerInt;

    public Mainmenu(){
    }
    public int menuPrintOut(int amount){
        System.out.println("1. Product list");
        System.out.println("2. Product description");
        System.out.println("3. Put in money");
        System.out.println("4. Buy product");
        System.out.println("5. Quit");
        System.out.println("6. Check money slots(admin only)");
        System.out.printf("Money in deposition: ");
        System.out.println(""+ amount);
        System.out.println("");

        answer = mainMenuScanner(amount);

        answerInt = Integer.parseInt(answer);

        return answerInt;
    }
    public String mainMenuScanner(int amount){

        Scanner scNr1 = new Scanner(System.in);
        answer = scNr1.nextLine(); // holds actual input
        return answer;
    }
}
