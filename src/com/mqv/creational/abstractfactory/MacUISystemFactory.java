package com.mqv.creational.abstractfactory;

import com.mqv.creational.abstractfactory.component.Button;
import com.mqv.creational.abstractfactory.component.Dialog;
import com.mqv.creational.abstractfactory.component.Text;
import com.mqv.creational.abstractfactory.component.macos.MacButton;
import com.mqv.creational.abstractfactory.component.macos.MacDialog;
import com.mqv.creational.abstractfactory.component.macos.MacTextField;

public class MacUISystemFactory extends GUIFactory {
    @Override
    Button createButton() {
        return new MacButton();
    }

    @Override
    Dialog createDialog(float width, float height) {
        return new MacDialog(width, height);
    }

    @Override
    Text createText(String content) {
        return new MacTextField(content);
    }
}
