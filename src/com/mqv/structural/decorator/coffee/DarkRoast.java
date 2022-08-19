package com.mqv.structural.decorator.coffee;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        super("Dark roast coffee");
    }

    @Override
    public double cost() {
        return 70;
    }
}
