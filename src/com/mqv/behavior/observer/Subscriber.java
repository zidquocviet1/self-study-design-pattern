package com.mqv.behavior.observer;

/**
 * @author VietMai - Initial contribution
 */
public interface Subscriber<T> {
    void onChanged(T data);
    String getName();
}
