package com.mqv.structural.adapter;

/**
 * @author Viet Mai - Initial contribution
 */
public class MicrosoftStock implements Stock {
    @Override
    public float getPrice() {
        return 242.71f;
    }

    @Override
    public String getSymbol() {
        return "MSFT";
    }
}
