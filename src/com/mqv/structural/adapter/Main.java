package com.mqv.structural.adapter;

/**
 * @author Viet Mai - Initial contribution
 */
public class Main {
    public static void main(String[] args) {
        var appleStockAdapter = new AppleStockAdapter(new AppleStock());

        System.out.println(appleStockAdapter.getSymbol());
        System.out.println("Stock price: " + appleStockAdapter.getPrice());
        System.out.println("The ratio of apple stock over google stock: " + appleStockAdapter.getRatio());
    }
}
