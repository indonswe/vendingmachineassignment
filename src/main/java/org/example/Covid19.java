package org.example;

abstract class Covid19 extends Product {
    public Covid19(String name, int amount) {
        super(name, amount);
    }

    public abstract String examine();
    String toString(String s) {
        return s;
    }

    @Override
    public String use() {
        return toString("You consumed a virus killer");
    }
}

