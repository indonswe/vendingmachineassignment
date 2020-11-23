package org.example;

abstract class Product {
    public abstract String examine();
    public abstract String use();
}
class chocolade extends Product{

    @Override
    public String examine(){
        return null;
    }

    @Override
    public String use() {
        return null;
    }
}
class snickers extends chocolade{

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
