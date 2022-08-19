package com.mqv.structural.decorator.coffee.material;

import com.mqv.structural.decorator.coffee.Beverage;

public class Sugar extends Material {
    public Sugar(Beverage beverage) {
        super("Sugar", beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Sugar";
    }
}
