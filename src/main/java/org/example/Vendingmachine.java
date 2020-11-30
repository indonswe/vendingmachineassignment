package org.example;

import java.util.Arrays;

interface vendingMachineInterface{
    void addCurrency(int amount);
    Product request(int productNumber);
    int endSession();
    String getDescription(int productNumber);
    int getBalance();
    String[] getProducts();
}

public class Vendingmachine implements vendingMachineInterface{


    private static Product[] productArray   = new Product[2];

    public Vendingmachine(){
        Machine newMachine = new Machine("Machine", 0);
        Snickers newSnickers = new Snickers("Snickers", 8);

        Vendingmachine.productArray[0]= newMachine;
        Vendingmachine.productArray[1]= newSnickers;



    }

    @Override
    public void addCurrency(int amount) {
        productArray[0].amount = productArray[0].amount+ amount;
        //productArray[productArray.length-1].amount = productArray[productArray.length-1].amount + amount;
    }

    @Override
    public Product request(int productNumber) {
        //Product[] onlyProductsArray = Arrays.copyOf(productArray, productArray.length-1);
        //String[]stringProductsArray= new String[onlyProductsArray.length];
        Product answer = productArray[productNumber];

        return answer;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int productNumber) {
        return null;
    }

    @Override
    public int getBalance() {
        //System.out.println(productArray[productArray.length-1].amount);

        //return productArray[productArray.length-1].amount;
        return productArray[0].amount;
    }

    @Override
    public String[] getProducts() {
        Product[] onlyProductsArray = Arrays.copyOf(productArray, productArray.length-1);

        String[]stringProductsArray= new String[onlyProductsArray.length];

        for (int i = 0, j = 1; i < productArray.length-1; i++, j++) {
            onlyProductsArray[i]= productArray[j];

            stringProductsArray[i]=onlyProductsArray[i].examine();

        }
        return stringProductsArray;
        //return onlyProductsArray;
    }
}
