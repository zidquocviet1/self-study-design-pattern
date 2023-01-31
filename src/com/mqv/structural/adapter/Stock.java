package com.mqv.structural.adapter;

/**
 * @author Viet Mai - Initial contribution
 */
public interface Stock {
    /**
     * Return price of the derived stock at 31/01/2023.
     * <p>
     * This value is dollar unit
     */
    float getPrice();

    String getSymbol();
}
