package com.mqv.creational.abstractfactory;

import com.mqv.creational.abstractfactory.component.Button;
import com.mqv.creational.abstractfactory.component.Dialog;
import com.mqv.creational.abstractfactory.component.Text;

/**
 * Factory entry point class to create all the component from system.
 */
public abstract class GUIFactory {
    abstract Button createButton();
    abstract Dialog createDialog(float width, float height);
    abstract Text createText(String content);
}
