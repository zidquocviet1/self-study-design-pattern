package com.mqv.creational.builder;

public class WindowData {
    private boolean isOpen;
    private boolean isBreakDown;
    private Direction direction;

    public enum Direction {
        HORIZONTAL, VERTICAL, PULL_PUSH
    }

    public WindowData() {
    }

    public WindowData(WindowData copy) {
        this(copy.isOpen, copy.isBreakDown, copy.direction);
    }

    public WindowData(boolean isOpen, boolean isBreakDown, Direction direction) {
        this.isOpen = isOpen;
        this.isBreakDown = isBreakDown;
        this.direction = direction;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public boolean isBreakDown() {
        return isBreakDown;
    }

    public void setBreakDown(boolean breakDown) {
        isBreakDown = breakDown;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "WindowData{" +
                "isOpen=" + isOpen +
                ", isBreakDown=" + isBreakDown +
                ", direction=" + direction +
                '}';
    }
}
