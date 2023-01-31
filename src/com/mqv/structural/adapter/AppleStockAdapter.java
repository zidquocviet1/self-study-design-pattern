package com.mqv.structural.adapter;

/**
 * @author Viet Mai - Initial contribution
 */
public class AppleStockAdapter extends GoogleStock {
    private final AppleStock appleStock;

    public AppleStockAdapter(AppleStock appleStock) {
        this.appleStock = appleStock;
    }

    public float getRatio() {
        return appleStock.getPrice() / super.getPrice();
    }
}
