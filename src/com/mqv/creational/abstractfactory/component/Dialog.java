package com.mqv.creational.abstractfactory.component;

public abstract class Dialog implements UILifecycle {
    protected final float width;
    protected final float height;

    protected Dialog(float width, float height) {
        this.width = width;
        this.height = height;

        onCreate();
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public void onDraw() {
        System.out.println("Drawing the dialog on top of others ui component");
    }
}
