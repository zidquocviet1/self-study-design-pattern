package com.mqv.structural.decorator.coffee.material;

import com.mqv.structural.decorator.coffee.Beverage;

public class CondensedMilk extends Milk {
    public CondensedMilk(Beverage beverage) {
        super("Condensed Milk", "", beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 20;
    }
}
