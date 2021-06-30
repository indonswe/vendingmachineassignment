package org.example.Models;

import org.example.Sequencers.Productsequencer;

public abstract class Product {
    public String name;
    public int amount;
    public int productId;


    public Product(String name, int amount){
        this.name = name;
        this.amount = amount;
        int id = Productsequencer.nextProductId();
        this.productId= id;

    }
    public abstract String examine();
    public abstract String use();
}


