package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static org.example.App.start;

public class App
{
    public static String question;
    public static int answerInt;
    public static void main( String[] args )
    {
        int amount = start();
        System.out.println("Revenue machine today: "+ amount);
        createFile();
        String amountString = String.valueOf(amount);
        saveFile(amountString);
        System.out.println("Total revenue machine: ");
        readFile();
    }
    public static int start(){

        int answer;
        boolean quit = false;
        int amount;

        String answerString;
        Vendingmachine vendingMachine = new Vendingmachine();
        do {
            Mainmenu mainmenu = new Mainmenu();// handle main menu
            amount = vendingMachine.getBalance();
            answer = mainmenu.menuPrintOut(amount);
            //if (testAnswer>0) answer = testAnswer;
            if (answer == 1) {
                String[] getProducts = vendingMachine.getProducts();
                one(getProducts);
            } else if (answer == 2) {
                System.out.println("Examine product(enter productId): ");
                sca();
                Product answerProduct = vendingMachine.request(answerInt);
                two(answerProduct);
            } else if (answer == 3) {
                System.out.println("How much money do you want to deposit: ");
                sca();
                vendingMachine.addCurrency(answerInt);

            }else if (answer == 4) {
                System.out.println("Buy product(enter productId): ");
                sca();

                Product answerProduct = vendingMachine.request(answerInt);
                answerString = answerProduct.examine();
                System.out.println(answerString);
                System.out.println("Do you want to buy the product(y/n)? ");
                sca();
                char questionCharacter = question.charAt(0);
                if (questionCharacter == 'y') {
                    amount = vendingMachine.getBalance();
                    int price = answerProduct.amount;
                    if (price < amount) {
                        vendingMachine.addCurrency(-price);
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
                amount = vendingMachine.getBalance();
                vendingMachine.money.giveMoneyBack(amount);
                quit=true;
            } else if (answer == 6) {
                vendingMachine.money.cashByUser();
            }
        }while(quit==false);
        return amount; //Program finish at this place
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

    public static void createFile(){
        try {
            File myObj = new File("amount.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void saveFile(String amount){
        try {
            FileWriter myWriter = new FileWriter("amount.txt");
            //myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.write(amount);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void readFile(){
        //String amounts;
        try {
            File myObj = new File("amount.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //return data;
    }

}
