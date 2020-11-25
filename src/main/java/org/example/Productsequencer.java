package org.example;

public class Productsequencer {
    private static int productId = 0;
    //public int nextProductId;

    public static int nextProductId(){
        Productsequencer.productId = ++ productId;
        //TodoSequencer.todoId = ++todoId;
        return productId;
    }
}
