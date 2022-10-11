package com.mqv.creational.abstractfactory.component.window;

import com.mqv.creational.abstractfactory.component.Dialog;

public class WinDialog extends Dialog {
    public WinDialog(float width, float height) {
        super(width, height);
    }

    @Override
    public void onCreate() {
        if (width > 0 && height > 0) {
            System.out.println("The primary size of dialog is valid, trying to create it");
        }
    }
}
