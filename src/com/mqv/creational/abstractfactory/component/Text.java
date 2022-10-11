package com.mqv.creational.abstractfactory.component;

public abstract class Text implements UILifecycle {
    protected final String content;

    protected Text(String content) {
        this.content = content;
        onCreate();
    }

    public String getContent() {
        return content;
    }

    @Override
    public void onDraw() {
        System.out.println("Draw text field!!!");
    }
}
