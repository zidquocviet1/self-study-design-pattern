package com.mqv.creational.abstractfactory.component.window;

import com.mqv.creational.abstractfactory.component.Text;

public class WinTextBox extends Text {
    public WinTextBox(String content) {
        super(content);
    }

    @Override
    public void onCreate() {
        System.out.println("Creating window text box");
    }
}
