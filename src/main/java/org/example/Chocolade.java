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
        return toString("Snickers, vikt: 100 gram, pris: 8 kr, kcal: 500.");
    }

    private String toString(String s) {
        return s;
    }

    @Override
    public String use() {
        return toString("Nice with some chocolade but it was just to little");
    }
}
class Paradis extends Chocolade{

    public Paradis(String name, int amount) {
        super(name, amount);
    }

    @Override
    public String examine(){
        return toString("Paradis, vikt: 500 gram, pris: 39 kr, kcal: 2500.");
    }

    private String toString(String s) {
        return s;
    }

    @Override
    public String use() {
        return toString("Wow, you ate all chocolade in one go, impressive!");
    }
}