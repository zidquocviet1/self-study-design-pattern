package com.mqv.creational.abstractfactory;

import com.mqv.creational.abstractfactory.component.Button;
import com.mqv.creational.abstractfactory.component.Dialog;
import com.mqv.creational.abstractfactory.component.Text;
import com.mqv.creational.abstractfactory.component.window.WinButton;
import com.mqv.creational.abstractfactory.component.window.WinDialog;
import com.mqv.creational.abstractfactory.component.window.WinTextBox;

public class WindowUISystemFactory extends GUIFactory {
    @Override
    Button createButton() {
        return new WinButton();
    }

    @Override
    Dialog createDialog(float width, float height) {
        return new WinDialog(width, height);
    }

    @Override
    Text createText(String content) {
        return new WinTextBox(content);
    }
}
