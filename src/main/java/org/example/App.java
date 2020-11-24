package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        int answer;
        boolean quit = false;
        String name= "Machine";
        int amount = 0;
        String question;
        int answerInt;

        Product machine = new Product(name,amount);
        Vendingmachine m = new Vendingmachine(amount);
        //m.addCurrency(0);


        do{
            mainMenu pMM = new mainMenu();// handle main menu
            amount = m.getBalance();
            answer = pMM.pMM(amount);
            if (answer == 1) {

                break; // ends the program
            }else if(answer == 2){
                System.out.println("How much money do you want to deposit: ");
                Scanner scNr1 = new Scanner(System.in);
                question = scNr1.nextLine(); // holds actual input
                answerInt = Integer.parseInt(question);
                m.addCurrency(answerInt);

            }








        }while(quit==false);


    }
}
