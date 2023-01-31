package com.mqv.structural.adapter;

/**
 * @author Viet Mai - Initial contribution
 */
public class GoogleStock implements Stock {
    @Override
    public float getPrice() {
        return 97.95f;
    }

    @Override
    public String getSymbol() {
        return "GOOG";
    }
}
