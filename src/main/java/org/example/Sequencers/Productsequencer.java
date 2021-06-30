package org.example.Sequencers;

public class Productsequencer {
    private static int productId = 0;


    public static int nextProductId(){
        Productsequencer.productId = ++productId;
        return productId;
    }
    public static void reset() {
        Productsequencer.productId = 0;
    }

}
