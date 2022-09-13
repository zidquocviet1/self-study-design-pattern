package com.mqv.behavior.observer;

/**
 * @author VietMai - Initial contribution
 */
public class MobileSubscriber implements Subscriber<Stock> {
    @Override
    public void onChanged(Stock data) {
        System.out.println("Received new stock data from mobile client: " + data.name());
    }

    @Override
    public String getName() {
        return "Android";
    }
}
