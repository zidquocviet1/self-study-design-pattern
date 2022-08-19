package com.mqv.structural.decorator.coffee.model;

import java.util.LinkedList;
import java.util.List;

public class Waiter {
    private final List<Order> orderList;

    public Waiter() {
        this.orderList = new LinkedList<>();
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void addOrder(Order order) {
        this.orderList.add(order);
    }

}
