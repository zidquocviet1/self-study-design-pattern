package com.mqv.behavior.strategy;

import com.mqv.behavior.strategy.client.InPersonOrder;
import com.mqv.behavior.strategy.client.OnlineOrder;
import com.mqv.behavior.strategy.client.Order;
import com.mqv.behavior.strategy.client.Product;
import com.mqv.behavior.strategy.concrete.CashPayment;
import com.mqv.behavior.strategy.concrete.CreditCardStrategy;
import com.mqv.behavior.strategy.concrete.MomoStrategy;
import com.mqv.behavior.strategy.concrete.PaypalStrategy;

import java.util.List;

public class StrategyExample {
    public static void main(String[] args) {
        int validCardNumber = 123;
        int validCvv = 333;

        Order order = new InPersonOrder();
        Order onlineOrder = new OnlineOrder();

        List<Product> productList = List.of(
                new Product("Nike Air Force 1", 50000),
                new Product("Adidas Yeezy 350", 12400),
                new Product("Nike Mercurial", 500),
                new Product("Macbook Pro 16inch M1 Pro", 5052000),
                new Product("Studio Display", 985000)
        );

        order.setProductList(productList);
        onlineOrder.setProductList(productList);

        // Pay by momo
        onlineOrder.setPaymentStrategy(new MomoStrategy());
        onlineOrder.pay();

        // Pay by Credit Card
        onlineOrder.setPaymentStrategy(new CreditCardStrategy(validCardNumber, validCvv));
        onlineOrder.pay();

        // Pay by Paypal
        onlineOrder.setPaymentStrategy(new PaypalStrategy());
        onlineOrder.pay();

        order.setPaymentStrategy(new CashPayment());
        order.pay();
    }
}
