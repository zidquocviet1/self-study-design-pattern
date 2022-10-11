package com.mqv.creational.abstractfactory.component.macos;

import com.mqv.creational.abstractfactory.component.Dialog;

public class MacDialog extends Dialog {
    public MacDialog(float width, float height) {
        super(width, height);
    }

    @Override
    public void onCreate() {
        System.out.println("Creating macOs dialog ui component");
    }
}
