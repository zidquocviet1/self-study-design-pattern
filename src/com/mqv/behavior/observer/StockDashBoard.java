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
        stockSubscribers.add(subscriber);
    }

    @Override
    public void unregisterObserver(Subscriber<Stock> subscriber) {
        stockSubscribers.remove(subscriber);
    }

    @Override
    public void notifyDataSetChanged(Stock data) {
        stockSubscribers.forEach(subscriber -> subscriber.onChanged(data));
    }
}
