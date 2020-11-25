package org.example;

public class Product {
    String name;
    int amount;
    int productId;


    public Product(String name, int amount){
        this.name = name;
        this.amount = amount;
        int id = Productsequencer.nextProductId();
        this.productId= id;
    }
}


