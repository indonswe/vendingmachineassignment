package org.example;

abstract class Chocolade extends Product {
    public abstract String examine();
    public abstract String use();
}
class Snickers extends Chocolade{

    @Override
    public String examine(){
        return toString("Pris 5 kr, vikt 100 gram, kalorier 50 kcal.");
    }

    private String toString(String s) {
        return s;
    }

    @Override
    public String use() {
        return null;
    }
}