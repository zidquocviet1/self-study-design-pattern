package com.mqv.creational.builder;

public class WheelData {
    private boolean isWheeling;
    private int size;
    private WheelType type;

    public enum WheelType {
        STEEL,
        ALLOY,
        MULTI_PIECE,
        CHROME,
        DIAMOND_CUT
    }

    public WheelData() {

    }

    public WheelData(boolean isWheeling, int size, WheelType type) {
        this.isWheeling = isWheeling;
        this.size = size;
        this.type = type;
    }

    public WheelData(WheelData copy) {
        this(copy.isWheeling, copy.size, copy.type);
    }

    public boolean isWheeling() {
        return isWheeling;
    }

    public void setWheeling(boolean wheeling) {
        isWheeling = wheeling;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public WheelType getType() {
        return type;
    }

    public void setType(WheelType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "WheelData{" +
                "isWheeling=" + isWheeling +
                ", size=" + size +
                ", type=" + type +
                '}';
    }
}
