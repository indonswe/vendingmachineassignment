package org.example;

abstract class Chocolade extends Product {
    public Chocolade(String name, int amount) {
        super(name, amount);
    }

    public abstract String examine();
    public abstract String use();
}
class Snickers extends Chocolade{

    public Snickers(String name, int amount) {
        super(name, amount);
    }

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