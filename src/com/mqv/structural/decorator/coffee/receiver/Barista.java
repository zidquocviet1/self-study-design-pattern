package com.mqv.structural.decorator.coffee.receiver;

import com.mqv.structural.decorator.coffee.OrderProcessor;
import com.mqv.structural.decorator.coffee.model.Order;

public record Barista(String name) implements OrderProcessor {
    @Override
    public void process(Order order) {
        System.out.println("Barista " + name + " is processing the order id: " + order.getId());

        double totalPrice = order.getBeverageList()
                .stream()
                .mapToDouble(beverage -> {
                    System.out.println(beverage.getDescription() + " process done!");
                    return beverage.cost();
                }).sum();

        System.out.println("Total price of this order is: " + totalPrice);
        System.out.println();
    }
}
