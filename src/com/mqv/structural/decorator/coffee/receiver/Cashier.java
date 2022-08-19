package com.mqv.structural.decorator.coffee.receiver;

import com.mqv.structural.decorator.coffee.OrderProcessor;
import com.mqv.structural.decorator.coffee.model.Order;

public class Cashier implements OrderProcessor {
    private final String name;
    private volatile int orderProcessed;

    public Cashier(String name) {
        this.name = name;
    }

    public synchronized void waitForAvailableAndProcess(long timestamp) throws InterruptedException {
        System.out.println("Waiting for cashier");
        while (timestamp > System.currentTimeMillis()) wait(3000);
        System.out.println("Cashier is available for billing");
    }

    public int getOrderProcessed() { return orderProcessed; }

    @Override
    public synchronized void process(Order order) {
        System.out.println("The cashier " + name + " is processing the order: " + order.getId());

        try {
            Thread.sleep(2000);

            System.out.println("The cashier processed this order: " + order.getId());

            orderProcessed++;

            System.out.println("The total order was processed: " + getOrderProcessed());
        } catch (InterruptedException e) {
            System.out.println("System is stuck when trying to process order");
        }
    }
}
