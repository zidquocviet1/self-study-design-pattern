package com.mqv.creational.builder;

public class CarState {
    private WheelData wheelData;
    private EngineData engineData;
    private WindowData windowData;

    public CarState() {
    }

    public CarState(WheelData wheelData, EngineData engineData, WindowData windowData) {
        this.wheelData = wheelData;
        this.engineData = engineData;
        this.windowData = windowData;
    }

    public WheelData getWheelData() {
        return wheelData;
    }

    public void setWheelData(WheelData wheelData) {
        this.wheelData = wheelData;
    }

    public EngineData getEngineData() {
        return engineData;
    }

    public void setEngineData(EngineData engineData) {
        this.engineData = engineData;
    }

    public WindowData getWindowData() {
        return windowData;
    }

    public void setWindowData(WindowData windowData) {
        this.windowData = windowData;
    }

    public CarStateBuilder toBuilder() {
        return new CarStateBuilder(this);
    }

    @Override
    public String toString() {
        return "CarState{" +
                "wheelData=" + wheelData +
                ", engineData=" + engineData +
                ", windowData=" + windowData +
                '}';
    }
}
