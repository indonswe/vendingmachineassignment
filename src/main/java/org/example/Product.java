package org.example;

public class Product {
    String name;
    int amount;
    int productId;
    String examine;



    public Product(String name, int amount){
        this.name = name;
        this.amount = amount;
        int id = Productsequencer.nextProductId();
        this.productId= id;


    }

    public String examine() {
        return null;
    }


}


