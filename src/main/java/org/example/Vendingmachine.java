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


    private static Product[] productArray   = new Product[7];
    cashInterface money = new cashInterface();
    public Vendingmachine(){

        Machine newMachine = new Machine("Machine", 0);
        Snickers newSnickers = new Snickers("Snickers", 8);
        Paradis paradis = new Paradis("Paradis", 39);
        Cocacola cocacola = new Cocacola("Cocacola", 13);
        Water water = new Water("Water", 5);
        Zinc zinc = new Zinc("Zinc", 50);
        Quercetin quercetin = new Quercetin("Quercetin", 300);
        Vendingmachine.productArray[0]= newMachine;
        Vendingmachine.productArray[1]= newSnickers;
        Vendingmachine.productArray[2]= paradis;
        Vendingmachine.productArray[3]= cocacola;
        Vendingmachine.productArray[4]= water;
        Vendingmachine.productArray[5]= zinc;
        Vendingmachine.productArray[6]= quercetin;




    }

    @Override
    public void addCurrency(int amount) {
        System.out.println(amount);
        if (amount>-1){
           amount = money.depositMoneySlot(amount);
        }else{ }
        productArray[0].amount = productArray[0].amount+ amount;
    }

    @Override
    public Product request(int productNumber) {
        Product answer = productArray[productNumber];
        return answer;
    }

    @Override
    public int endSession() {
        int amount = productArray[0].amount;
        productArray[0].amount = 0;
        return amount;
    }

    @Override
    public String getDescription(int productNumber) {
        String getDes = productArray[productNumber].examine;
        return getDes;
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
        String prodIdAndNames;
        String[]stringProductsArray= new String[onlyProductsArray.length];

        for (int i = 0, j = 1; i < productArray.length-1; i++, j++) {
            onlyProductsArray[i]= productArray[j];
            prodIdAndNames = ("Productid: "+onlyProductsArray[i].productId+" Name: "+onlyProductsArray[i].name);

            stringProductsArray[i]=prodIdAndNames;

        }
        //System.out.println(stringProductsArray.length);
        return stringProductsArray;
        //return onlyProductsArray;
    }
}
