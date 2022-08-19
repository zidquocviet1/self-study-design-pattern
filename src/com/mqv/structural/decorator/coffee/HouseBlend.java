package com.mqv.structural.decorator.coffee;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        super("House blend coffee");
    }

    @Override
    public double cost() {
        return 50;
    }
}
