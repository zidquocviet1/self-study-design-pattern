package com.mqv.structural.decorator.coffee;

public abstract class Beverage {
    private final String description;

    protected Beverage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
