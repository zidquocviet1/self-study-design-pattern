package com.mqv.structural.decorator.coffee.model;

import com.mqv.structural.decorator.coffee.Beverage;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    private final String id;
    private final List<Beverage> beverageList;

    private Order(List<Beverage> beverageList) {
        this.id = UUID.randomUUID().toString();
        this.beverageList = beverageList;
    }

    public String getId() {
        return id;
    }

    public List<Beverage> getBeverageList() {
        return beverageList;
    }

    public static Builder withBuilder() {
        return new Builder();
    }

    public static class Builder {
        private final List<Beverage> beverage;

        private Builder() {
            beverage = new ArrayList<>();
        }

        public Builder withBeverage(Beverage beverage) {
            this.beverage.add(beverage);
            return this;
        }

        public Order build() {
            return new Order(beverage);
        }
    }
}
