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
        //Snickers snickers = new Snickers("Snickers",5);
        //Paradis paradis = new Paradis("Paradis", 39);



        do {
            mainMenu pMM = new mainMenu();// handle main menu
            amount = m.getBalance();
            answer = pMM.pMM(amount);
            //System.out.println(answer);
            if (answer == 5) {
                break; // ends the program
            } else if (answer == 3) {
                System.out.println("How much money do you want to deposit: ");
                Scanner scNr1 = new Scanner(System.in);
                question = scNr1.nextLine(); // holds actual input
                answerInt = Integer.parseInt(question);
                m.addCurrency(answerInt);
                System.out.println(answerInt);
            } else if (answer == 4) {
                System.out.println("Buy/examine product(enter productId): ");
                Scanner scNr1 = new Scanner(System.in);
                question = scNr1.nextLine(); // holds actual input
                answerInt = Integer.parseInt(question);
                Product answerProduct = m.request(answerInt);
                answerString = answerProduct.examine();
                //System.out.println(answerProduct.toString());
                System.out.println(answerString);
                System.out.println("Do you want to buy the product(y/n)? ");
                scNr1 = new Scanner(System.in);
                question = scNr1.nextLine(); // holds actual input
                char questionCharacter = question.charAt(0);
                if(questionCharacter=='y') {
                    amount = m.getBalance();
                    int price = answerProduct.amount;
                    if (price<amount){
                        m.addCurrency(-price);
                        System.out.println("Congratulations, you bought the product");
                        System.out.println("Do you want to consume the product? ");
                        scNr1 = new Scanner(System.in);
                        question = scNr1.nextLine(); // holds actual input
                        questionCharacter = question.charAt(0);
                        if(questionCharacter=='y') {
                            answerString = answerProduct.use();
                            System.out.println(answerString);
                        }
                    }else{
                        System.out.println("You need to deposit more money to buy this product");
                    }

                }else {

                }

            } else if (answer == 1) {
                String[] getProducts = m.getProducts();
                System.out.println(getProducts.length);
                for (int i = 0; i < getProducts.length; i++) {

                    System.out.println(getProducts[i]);
                }

            }else if (answer == 6){

            } else if (answer == 2) {
                System.out.println("Examine product(enter productId): ");
                Scanner scNr1 = new Scanner(System.in);
                question = scNr1.nextLine(); // holds actual input
                answerInt = Integer.parseInt(question);
                Product answerProduct = m.request(answerInt);
                answerString = answerProduct.examine();
                //System.out.println(answerProduct.toString());
                System.out.println(answerString);
            }
        }while(quit==false);
    }











}
