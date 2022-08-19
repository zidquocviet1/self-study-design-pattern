package com.mqv.structural.decorator.coffee;

import com.mqv.structural.decorator.coffee.command.ProcessOrderCommand;
import com.mqv.structural.decorator.coffee.material.CondensedMilk;
import com.mqv.structural.decorator.coffee.material.FreshMilk;
import com.mqv.structural.decorator.coffee.material.Ice;
import com.mqv.structural.decorator.coffee.material.Sugar;
import com.mqv.structural.decorator.coffee.receiver.Barista;
import com.mqv.structural.decorator.coffee.model.Order;
import com.mqv.structural.decorator.coffee.model.Waiter;
import com.mqv.structural.decorator.coffee.receiver.Cashier;

public class CoffeeMachine {
    public static void main(String[] args) {
        // Create list of beverages
        var houseBlend = new HouseBlend();
        var darkRoast = new DarkRoast();

        var houseBlendWithFreshMilk = new FreshMilk(houseBlend);
        var houseBlendWithFreshMilkAndSugar = new Sugar(houseBlendWithFreshMilk);
        var houseBlendWithFreshMilkAndSugarAnd50Ice = new Ice(0.5, "pill", houseBlendWithFreshMilkAndSugar);

        var sonOrder = Order.withBuilder()
                .withBeverage(houseBlend)
                .withBeverage(houseBlendWithFreshMilk)
                .withBeverage(houseBlendWithFreshMilkAndSugarAnd50Ice)
                .build();

        var namOrder = Order.withBuilder()
                .withBeverage(darkRoast)
                .withBeverage(houseBlend)
                .withBeverage(houseBlendWithFreshMilkAndSugar)
                .withBeverage(new CondensedMilk(darkRoast))
                .build();
        var viet = new Waiter();

        viet.addOrder(sonOrder);
        viet.addOrder(namOrder);

        var barista = new Barista("Viet");
        var cashier = new Cashier("Kendal Jenner");

        // Process the order list from Viet waiter
        viet.getOrderList().forEach(order -> {
            new ProcessOrderCommand(barista, order).execute();
            new Thread(() -> new ProcessOrderCommand(cashier, order).execute()).start();
        });
    }
}
