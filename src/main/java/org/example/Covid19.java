package org.example;

abstract class Covid19 extends Product {
    public Covid19(String name, int amount) {
        super(name, amount);
    }

    public abstract String examine();
    private String toString(String s) {
        return s;
    }
    //public abstract String use();
    @Override
    public String use() {
        return toString("Upping the odds of survival");
    }
}

class Zinc extends Covid19{

    public Zinc(String name, int amount) {
        super(name, amount);
    }

    @Override
    public String examine(){
        return toString("Pris 50 kr, need to get inte the virus cells");
    }

    private String toString(String s) {
        return s;
    }

    @Override
    public String use() {
        return null;
    }
}
class Quercetin extends Covid19{

    public Quercetin(String name, int amount) {
        super(name, amount);
    }

    @Override
    public String examine(){
        return toString("Pris 300 kr, help Zinc getting into virus cells");
    }

    private String toString(String s) {
        return s;
    }

    @Override
    public String use() {
        return null;
    }
}