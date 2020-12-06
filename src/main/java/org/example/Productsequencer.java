package org.example;

public class Productsequencer {
    private static int productId = -1;
    //public int nextProductId;

    public static int nextProductId(){
        Productsequencer.productId = ++productId;
        //TodoSequencer.todoId = ++todoId;
        return productId;
    }
    public static void reset() {
        Productsequencer.productId = -1;
    }

}
