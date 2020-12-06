package org.example;

import java.util.Scanner;

/*State of my Vendingmachine about 22.30 Sunday
The good: The app seems to work, think I have followed the instructions somewhat, used abstract, interface, enum
The inbetween: My best implementation of Junit so far when it comes to cover but bad naming and app not covered
The bad: The app is messy and basically no comments in any of the code
mvh Adrian Nilsson*/

public class App 
{
    public static String question;
    public static int answerInt;
    public static void main( String[] args )
    {
        int tryInt = start(0);
    }
    public static int start(int testAnswer){
        int answer;
        boolean quit = false;
        //String name= "Machine";
        int amount = 0;
        //String question;
        //int answerInt;
        String answerString;
        Vendingmachine m = new Vendingmachine();
        do {
            mainMenu pMM = new mainMenu();// handle main menu
            amount = m.getBalance();
            answer = pMM.pMM(amount);
            if (testAnswer>0) answer = testAnswer;
            if (answer == 1) {
                String[] getProducts = m.getProducts();
                one(getProducts);
            } else if (answer == 2) {
                System.out.println("Examine product(enter productId): ");
                sca();
                Product answerProduct = m.request(answerInt);
                two(answerProduct);
            } else if (answer == 3) {
                System.out.println("How much money do you want to deposit: ");
                sca();
                m.addCurrency(answerInt);
                //System.out.println(answerInt);
            }else if (answer == 4) {
                System.out.println("Buy product(enter productId): ");
                sca();
                //four();
                Product answerProduct = m.request(answerInt);
                answerString = answerProduct.examine();
                System.out.println(answerString);
                System.out.println("Do you want to buy the product(y/n)? ");
                sca();
                char questionCharacter = question.charAt(0);
                if (questionCharacter == 'y') {
                    amount = m.getBalance();
                    int price = answerProduct.amount;
                    if (price < amount) {
                        m.addCurrency(-price);
                        System.out.println("Congratulations, you bought the product");
                        System.out.println("Do you want to consume the product? ");
                        sca();
                        questionCharacter = question.charAt(0);
                        if (questionCharacter == 'y') {
                            answerString = answerProduct.use();
                            System.out.println(answerString);
                        }
                    } else {
                        System.out.println("You need to deposit more money to buy this product");
                    }

                } else { }
            }else if (answer == 5) {
                amount = m.getBalance();
                m.money.giveMoneyBack(amount);
                quit=true;
            } else if (answer == 6) {
                m.money.cashByUser();
            }
        }while(quit==false);
        return answer;
    }


    public static void sca(){
        Scanner scNr1 = new Scanner(System.in);
        question = scNr1.nextLine(); // holds actual input
        if (!question.equals("y") & !question.equals("n")) answerInt = Integer.parseInt(question);
    }
    public static void one(String[] one){
        for (int i = 0; i < one.length; i++) {
            System.out.println(one[i]);
        }
    }
    public static void two(Product two){
        String answerTwo = two.examine();
        System.out.println(answerTwo);
    }

}
