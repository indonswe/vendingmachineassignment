package org.example.Data;

import org.example.Models.Product;

public abstract class Chocolade extends Product {
    public Chocolade(String name, int amount) {
        super(name, amount);
    }

    public abstract String examine();
    protected String toString(String s) {
        return s;
    }

    @Override
    public String use() {
        return toString("Chocolade empty, congratulations for consuming a massive amounts of calories");
    }
}
