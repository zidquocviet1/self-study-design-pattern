package com.mqv.creational.abstractfactory.component.window;

import com.mqv.creational.abstractfactory.component.Button;
import com.mqv.creational.abstractfactory.theme.Theme;
import com.mqv.creational.abstractfactory.theme.WindowTheme;

public class WinButton extends Button {
    @Override
    public Theme getTheme() {
        return new WindowTheme();
    }

    @Override
    public void onCreate() {
        System.out.println("Window button is created");
    }
}
