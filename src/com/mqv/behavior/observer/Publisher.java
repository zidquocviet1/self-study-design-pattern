package com.mqv.behavior.observer;

/**
 * @author VietMai - Initial contribution
 */
public interface Publisher<T> {
    void registerObserver(Subscriber<T> subscriber);
    void unregisterObserver(Subscriber<T> subscriber);
    void notifyDataSetChanged(T data);
}
