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

    private static Product[] productArray   = new Product[0];

    public Vendingmachine(){
        Product newPerson = new Product("Machine", 0);
        //newPerson.setFirstName(firstName);
        //newPerson.setLastName(lastName);
        Product[] newArray = Arrays.copyOf(productArray, productArray.length + 1); //Make bigger array
        newArray[newArray.length - 1] = newPerson; //Put the new Person in the bigger array
        Vendingmachine.productArray = newArray; //Makes the Person array same as the bigger array
        //return newPerson; //Returns new Person

        //this.addCurrency(0);
        //this.addCurrency(amount);
        //Product newProduct = new Product("a",amount);
        //productArray[productArray.length-1] = newProduct;

    }

    @Override
    public void addCurrency(int amount) {
        productArray[productArray.length-1].amount = productArray[productArray.length-1].amount + amount;
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
        System.out.println(productArray[productArray.length-1].amount);

        return productArray[productArray.length-1].amount;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}
