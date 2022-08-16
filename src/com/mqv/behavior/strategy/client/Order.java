package com.mqv.behavior.strategy.client;

import com.mqv.behavior.strategy.PaymentStrategy;

import java.util.List;

public class Order {
    private PaymentStrategy paymentStrategy;
    private List<Product> productList;

    public Order() {
    }

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void setProductList(List<Product> products) {
        this.productList = products;
    }

    public void pay() {
        paymentStrategy.pay(productList.stream().mapToInt(Product::price).sum());
    }
}
