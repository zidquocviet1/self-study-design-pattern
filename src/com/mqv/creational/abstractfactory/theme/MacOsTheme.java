package com.mqv.creational.abstractfactory.theme;

public class MacOsTheme implements Theme {
    @Override
    public int primaryColor() {
        return 9999;
    }

    @Override
    public int secondaryColor() {
        return 9090;
    }
}
