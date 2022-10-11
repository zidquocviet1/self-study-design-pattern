package com.mqv.creational.abstractfactory.component;

import com.mqv.creational.abstractfactory.theme.Theme;

public abstract class Button implements UILifecycle {
    protected Button() {
        onCreate();
    }

    public abstract Theme getTheme();

    @Override
    public void onDraw() {
        System.out.println("Drawing the window button to layout");
    }
}
