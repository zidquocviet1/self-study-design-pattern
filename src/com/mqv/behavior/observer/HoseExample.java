package com.mqv.behavior.observer;

/**
 * @author VietMai - Initial contribution
 */
public class HoseExample {
    public static void main(String[] args) {
        Publisher<Stock> dashBoard = new StockDashBoard();
        Subscriber<Stock> web = new WebSubscriber();
        Subscriber<Stock> mobile = new MobileSubscriber();

        dashBoard.registerObserver(mobile);
        dashBoard.registerObserver(web);

        dashBoard.notifyDataSetChanged(new Stock("AAPL", 1, 2, 3, 4, 5));
        System.out.println();

        Subscriber<Stock> desktop = new DesktopSubscriber();

        dashBoard.registerObserver(desktop);

        dashBoard.notifyDataSetChanged(new Stock("TLA", 32, 122, 332, 34, 70707070));
        System.out.println();

        dashBoard.unregisterObserver(web);
        dashBoard.notifyDataSetChanged(new Stock("MQV", 3234, 122132, 331222, 34, 71221212));
    }
}
