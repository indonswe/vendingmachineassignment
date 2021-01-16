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

/*class Cocacola extends Drinks{

    public Cocacola(String name, int amount) {
        super(name, amount);
    }

    @Override
    public String examine(){
        return toString("Cocacola: price 13kr, volume 33 cl, 30 kcal.");
    }

    private String toString(String s) {
        return s;
    }


}
class Water extends Drinks{

    public Water(String name, int amount) {
        super(name, amount);
    }

    @Override
    public String examine(){
        return toString("Water: price 5 kr, volume 5 dl, 0 kcal.");
    }

    private String toString(String s) {
        return s;
    }


}*/