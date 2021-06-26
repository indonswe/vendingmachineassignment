package org.example;

abstract class Drinks extends Product {
    public Drinks(String name, int amount) {
        super(name, amount);
    }

    public abstract String examine();
    String toString(String s) {
        return s;
    }

    @Override
    public String use() {
        return toString("You consumed a nice and cold drink");
    }
}

