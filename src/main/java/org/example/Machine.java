package org.example;

public class Machine extends Product {
    public Machine(String name, int amount) {
        super(name, amount);
    }

    @Override
    public String examine() {
        return null;
    }
    @Override
    public String use(){
       return null;
    }
}
