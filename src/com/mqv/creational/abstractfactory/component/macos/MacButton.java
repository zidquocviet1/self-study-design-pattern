package com.mqv.creational.abstractfactory.component.macos;

import com.mqv.creational.abstractfactory.component.Button;
import com.mqv.creational.abstractfactory.theme.MacOsTheme;
import com.mqv.creational.abstractfactory.theme.Theme;

public class MacButton extends Button {
    @Override
    public Theme getTheme() {
        return new MacOsTheme();
    }

    @Override
    public void onCreate() {
        System.out.println("Creating macOs button ui component!!!");
    }
}
