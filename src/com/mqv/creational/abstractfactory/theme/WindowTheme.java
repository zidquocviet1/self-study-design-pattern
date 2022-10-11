package com.mqv.creational.abstractfactory.theme;

public class WindowTheme implements Theme {
    @Override
    public int primaryColor() {
        return 123123;
    }

    @Override
    public int secondaryColor() {
        return 876124;
    }
}
