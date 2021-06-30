package org.example.Data;

import org.example.Models.Product;

public interface vendingMachineInterface {

    void addCurrency(int amount);
    Product request(int productNumber);
    int endSession();
    String getDescription(int productNumber);
    int getBalance();
    String[] getProducts();
}
