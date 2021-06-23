package org.example;

import java.util.Arrays;

interface vendingMachineInterface{
    void addCurrency(int amount);
    Product request(int productNumber);
    int endSession();
    String getDescription(int productNumber);
    int getBalance();
    String[] getProducts();
}

public class Vendingmachine implements vendingMachineInterface{

    private static Product[] productArray   = new Product[7];
    cashInterface money = new cashInterface();

    public Vendingmachine(){
        Product moneyPool = new Product("mainPool", 0) {
            @Override
            public String examine() {
                return null;
            }

            @Override
            public String use() {
                return null;
            }
        };
        //Snickers newSnickers = new Snickers("Snickers", 8);
        //Paradis paradis = new Paradis("Paradis", 39);
        Drinks cocacola = new Drinks("Cocacola", 13) {
            @Override
            public String examine() {
                return toString("Cocacola: price 13kr, volume 33 cl, 30 kcal.");
                }
        };
        //Cocacola cocacola = new Cocacola("Cocacola", 13);
        Drinks water = new Drinks("Water", 5) {
            @Override
            public String examine() {
                return toString("Water: price 5 kr, volume 5 dl, 0 kcal.");
            }
        };
        //Water water = new Water("Water", 5);
        Covid19 zinc = new Covid19("Zinc", 50) {
            @Override
            public String examine() {
                return toString("Zinc: price 50 kr, kill virus if you can get it into the cells");
            }
        };
        //Zinc zinc = new Zinc("Zinc", 50);
        Covid19 quercetin = new Covid19("Quercetin", 300) {
            @Override
            public String examine() {
                return toString("Quercetin: price 300 kr, helps Zinc getting into virus cells");
            }
        };
        //Quercetin quercetin = new Quercetin("Quercetin", 300);
        Vendingmachine.productArray[0]= moneyPool;
        //Vendingmachine.productArray[1]= newSnickers;
        //Vendingmachine.productArray[2]= paradis;
        Vendingmachine.productArray[3]= cocacola;
        Vendingmachine.productArray[4]= water;
        Vendingmachine.productArray[5]= zinc;
        Vendingmachine.productArray[6]= quercetin;
    }

    @Override
    public void addCurrency(int amount) {
        if (amount>-1){
           amount = money.depositMoneySlot(amount);
        }else{ }
        productArray[0].amount = productArray[0].amount+ amount;
    }

    @Override
    public Product request(int productNumber) {
        Product answer = productArray[productNumber];
        return answer;
    }

    @Override
    public int endSession() {
        int amount = productArray[0].amount;
        productArray[0].amount = 0;
        return amount;
    }

    @Override
    public String getDescription(int productNumber) {

        return null;
    }

    @Override
    public int getBalance() {
        return productArray[0].amount;
    }

    @Override
    public String[] getProducts() {
        Product[] onlyProductsArray = Arrays.copyOf(productArray, productArray.length-1);
        String prodIdAndNames;
        String[]stringProductsArray= new String[onlyProductsArray.length];

        for (int i = 0, j = 1; i < productArray.length-1; i++, j++) {
            onlyProductsArray[i]= productArray[j];
            prodIdAndNames = ("Productid: "+onlyProductsArray[i].productId+" Name: "+onlyProductsArray[i].name);

            stringProductsArray[i]=prodIdAndNames;

        }

        return stringProductsArray;

    }
}
