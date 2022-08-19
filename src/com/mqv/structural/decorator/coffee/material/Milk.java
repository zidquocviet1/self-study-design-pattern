package com.mqv.structural.decorator.coffee.material;

import com.mqv.structural.decorator.coffee.Beverage;

public abstract class Milk extends Material {
    protected final String name;

    public Milk(String name, String description, Beverage beverage) {
        super(description, beverage);
        this.name = name;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with " + name;
    }
}
