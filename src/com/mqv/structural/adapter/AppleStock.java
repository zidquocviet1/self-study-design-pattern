package com.mqv.structural.adapter;

/**
 * @author Viet Mai - Initial contribution
 */
public class AppleStock implements Stock {
    @Override
    public float getPrice() {
        return 143.0f;
    }

    @Override
    public String getSymbol() {
        return "AAPL";
    }
}
