package com.mqv.structural.decorator.coffee.material;

import com.mqv.structural.decorator.coffee.Beverage;

public abstract class Material extends Beverage {
    protected final Beverage beverage;

    public Material(String description, Beverage beverage) {
        super(description);
        this.beverage = beverage;
    }

    public abstract String getDescription();
}
