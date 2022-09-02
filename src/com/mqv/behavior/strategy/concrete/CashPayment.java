package com.mqv.behavior.strategy.concrete;

import com.mqv.behavior.strategy.PaymentStrategy;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        if (isEnoughMoney(amount)) {
            System.out.println("Pay order with cash");
        } else {
            System.out.println("Don't have enough money to pay");
        }
    }

    private boolean isEnoughMoney(int amount) {
        return amount <= 10_000;
    }
}
