package com.mqv.behavior.observer;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author VietMai - Initial contribution
 */
public class StockDashBoard implements Publisher<Stock> {
    private final Set<Subscriber<Stock>> stockSubscribers;

    public StockDashBoard() {
        this.stockSubscribers = new LinkedHashSet<>();
    }

    @Override
    public void registerObserver(Subscriber<Stock> subscriber) {
        System.out.println("New observer added: " + subscriber.getName());
        stockSubscribers.add(subscriber);
    }

    @Override
    public void unregisterObserver(Subscriber<Stock> subscriber) {
        System.out.println("Remove observer: " + subscriber.getName());
        stockSubscribers.remove(subscriber);
    }

    @Override
    public void notifyDataSetChanged(Stock data) {
        stockSubscribers.forEach(subscriber -> subscriber.onChanged(data));
    }
}
