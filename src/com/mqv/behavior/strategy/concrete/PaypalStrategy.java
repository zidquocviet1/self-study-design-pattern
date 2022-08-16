package com.mqv.behavior.strategy.concrete;

import com.mqv.behavior.strategy.PaymentStrategy;

public class PaypalStrategy implements PaymentStrategy {
    private final String username = "paypal";
    private final String password = "password";

    @Override
    public void pay(int amount) {
        System.out.println("Request login before paying order, basic credential: " + username + ":" + password);

        try {
            Thread.sleep(2000);
            System.out.println("Login successfully, pay this order by Paypal with total amount is: " + amount);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
