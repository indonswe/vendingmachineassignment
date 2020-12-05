package org.example;

abstract class Covid19 extends Product {
    public Covid19(String name, int amount) {
        super(name, amount);
    }

    public abstract String examine();
    private String toString(String s) {
        return s;
    }

    @Override
    public String use() {
        return toString("You consumed a virus killer");
    }
}

class Zinc extends Covid19{

    public Zinc(String name, int amount) {
        super(name, amount);
    }

    @Override
    public String examine(){
        return toString("Zinc: price 50 kr, kill virus if you can get it into the cells");
    }

    private String toString(String s) {
        return s;
    }


}
class Quercetin extends Covid19{

    public Quercetin(String name, int amount) {
        super(name, amount);
    }

    @Override
    public String examine(){
        return toString("Quercetin: price 300 kr, helps Zinc getting into virus cells");
    }

    private String toString(String s) {
        return s;
    }


}