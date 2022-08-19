package com.mqv.structural.decorator.coffee.material;

import com.mqv.structural.decorator.coffee.Beverage;

public class Ice extends Material {
    private final double amount;
    private final String type;

    public Ice(double amount, String type, Beverage beverage) {
        super("ice", beverage);
        this.amount = amount;
        this.type = type;
    }

    @Override
    public double cost() {
        return beverage.cost() + (amount <= 0.5 ? 0.1 : 0.2);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with ice type is " + type + " and amount percent is " + amount;
    }
}
