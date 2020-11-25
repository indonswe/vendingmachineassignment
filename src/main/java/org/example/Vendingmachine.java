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

    private static Product[] productArray   = new Product[9];

    public Vendingmachine(){
        Product newMachine = new Product("Machine", 0);
        //Product newChocolade = new Product("Snickers", 8);
        //Chocolade newChocolade = new Chocolade("Snickers", 8) {
            //@Override
            //public String examine() {
                //return null;
            //}

            //@Override
            //public String use() {
                //return null;
            //}
        //};
        Snickers newSnickers = new Snickers("Snickers", 8);
        Vendingmachine.productArray[0]= newMachine;
        Vendingmachine.productArray[1]= newSnickers;

        //Product[] newArray = Arrays.copyOf(productArray, productArray.length + 1); //Make bigger array
        //newArray[newArray.length - 1] = newPerson; //Put the new Person in the bigger array
       // Vendingmachine.productArray = newArray; //Makes the Person array same as the bigger array


    }

    @Override
    public void addCurrency(int amount) {
        productArray[0].amount = productArray[0].amount+ amount;
        //productArray[productArray.length-1].amount = productArray[productArray.length-1].amount + amount;
    }

    @Override
    public Product request(int productNumber) {
        return null;
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
        for (int i = 0, j = 1; i < productArray.length; i++, j++) {
            onlyProductsArray[i]= productArray[j];
            stringProductsArray[1]=onlyProductsArray.toString();
        }
        return stringProductsArray;
        //return onlyProductsArray;
    }
}
