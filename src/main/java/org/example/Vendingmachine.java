package org.example;

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

    public Vendingmachine(int amount){
        //this.addCurrency(0);
        this.addCurrency(amount);

    }

    @Override
    public void addCurrency(int amount) {
        //productArray[0].amount = amount;
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
        System.out.println(productArray.length);
        return 0;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}
