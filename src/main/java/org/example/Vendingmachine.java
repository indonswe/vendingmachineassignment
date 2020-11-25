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
        System.out.println(newSnickers.examine());
        Vendingmachine.productArray[0]= newMachine;
        Vendingmachine.productArray[1]= newSnickers;
        System.out.println(productArray[1].examine());

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
        //System.out.println(onlyProductsArray[0]);
        String[]stringProductsArray= new String[onlyProductsArray.length];
        System.out.println(productArray[1].examine());
        System.out.println(productArray.length);
        for (int i = 0, j = 1; i < productArray.length-1; i++, j++) {
            onlyProductsArray[i]= productArray[j];
            System.out.println((j));
            System.out.println(productArray[j].examine());
            stringProductsArray[i]=onlyProductsArray[i].examine();
            System.out.println(stringProductsArray[i]);
        }
        return stringProductsArray;
        //return onlyProductsArray;
    }
}
