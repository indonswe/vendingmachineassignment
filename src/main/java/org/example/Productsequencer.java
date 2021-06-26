package org.example;

public class Productsequencer {
    private static int productId = -1;


    public static int nextProductId(){
        Productsequencer.productId = ++productId;
        return productId;
    }
    public static void reset() {
        Productsequencer.productId = -1;
    }

}
