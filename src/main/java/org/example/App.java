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
        String answerString;


        Vendingmachine m = new Vendingmachine();




        do {
            mainMenu pMM = new mainMenu();// handle main menu
            amount = m.getBalance();
            answer = pMM.pMM(amount);
            System.out.println(answer);
            if (answer == 1) {
                break; // ends the program
            } else if (answer == 2) {
                System.out.println("How much money do you want to deposit: ");
                Scanner scNr1 = new Scanner(System.in);
                question = scNr1.nextLine(); // holds actual input
                answerInt = Integer.parseInt(question);
                m.addCurrency(answerInt);
                System.out.println(answerInt);
            } else if (answer == 3) {
                System.out.println("Buy/examine product(enter productId): ");
                Scanner scNr1 = new Scanner(System.in);
                question = scNr1.nextLine(); // holds actual input
                answerInt = Integer.parseInt(question);
                Product answerProduct = m.request(answerInt);
                System.out.println(answerProduct.toString());
                System.out.println(answerProduct.examine);
                System.out.println("Do you want to buy the product(y/n)? ");
                scNr1 = new Scanner(System.in);
                question = scNr1.nextLine(); // holds actual input
                answerString = Integer.parseInt(question);

            } else if (answer == 5) {
                String[] getProducts = m.getProducts();
                System.out.println(getProducts.length);
                for (int i = 0; i < getProducts.length; i++) {

                    System.out.println(getProducts[i]);
                }

            }
        }while(quit==false);
    }











}
