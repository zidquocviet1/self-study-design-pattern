package com.mqv.behavior.strategy.concrete;

import com.mqv.behavior.strategy.PaymentStrategy;

public class MomoStrategy implements PaymentStrategy {
    private final double discountPercent = 0.2; // 20%

    @Override
    public void pay(int amount) {
        System.out.println("Pay this order by Momo with total amount is: " + amount * (1 - discountPercent));
    }
}
