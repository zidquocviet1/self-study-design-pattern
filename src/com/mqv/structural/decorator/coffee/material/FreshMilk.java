package com.mqv.structural.decorator.coffee.material;

import com.mqv.structural.decorator.coffee.Beverage;

public class FreshMilk extends Milk {
    public FreshMilk(Beverage beverage) {
        super("Fresh milk", "", beverage);
    }

    @Override
    protected double milkCost() {
        return 25;
    }
}
