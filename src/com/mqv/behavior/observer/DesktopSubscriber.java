package com.mqv.behavior.observer;

/**
 * @author VietMai - Initial contribution
 */
public class DesktopSubscriber implements Subscriber<Stock> {
    @Override
    public void onChanged(Stock data) {
        System.out.println("Received new stock data from desktop client");
    }
}
