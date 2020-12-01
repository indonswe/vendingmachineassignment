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


    private static Product[] productArray   = new Product[3];

    public Vendingmachine(){
        Machine newMachine = new Machine("Machine", 0);
        Snickers newSnickers = new Snickers("Snickers", 8);
        Paradis paradis = new Paradis("Paradis", 39);

        Vendingmachine.productArray[0]= newMachine;
        Vendingmachine.productArray[1]= newSnickers;
        Vendingmachine.productArray[2]= paradis;



    }

    @Override
    public void addCurrency(int amount) {
        System.out.println(amount);
        if (amount>-1){
            //enum money{1,2,5,10,20,50,100,200,500,100}
           int c = new cashInterface(1);
            System.out.println(c);
        switch (amount) {
            case 1:
                break;
            case 2:
                break;
            case 5:
                break;
            case 10:
                break;
            case 20:
                break;
            case 50:
                break;
            case 100:
                break;
            case 200:
                break;
            case 500:
                break;
            case 1000:
                break;
            default:
                System.out.println("Input error");
                System.out.println("The machine accepts the following denominations");
                System.out.println("1kr, 2kr, 5kr, 10kr, 20kr, 50kr, 100kr, 200kr, 500kr, 1000kr.");
        }
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
