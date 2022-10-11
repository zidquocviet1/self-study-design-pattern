package com.mqv.creational.abstractfactory.component.macos;

import com.mqv.creational.abstractfactory.component.Text;

public class MacTextField extends Text {
    public MacTextField(String content) {
        super(content);
    }

    @Override
    public void onCreate() {
        System.out.println("Creating mac text field!!!");
    }
}
