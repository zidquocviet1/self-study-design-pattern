package com.mqv.behavior.strategy.concrete;

import com.mqv.behavior.strategy.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy {
    private final int cardNumber;
    private final int cvv;

    public CreditCardStrategy(int cardNumber, int cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        if (cardNumber == 123 && cvv == 333) {
            System.out.println("Your cardNumber and CVV is correct, so pay this order by Credit Card with total amount is: " + amount);
        } else {
            System.out.println("Sorry, card number or cvv is incorrect, please try again!");
        }
    }
}
