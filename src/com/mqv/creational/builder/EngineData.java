package com.mqv.creational.builder;

public class EngineData {
    private boolean isRunning;
    private EngineType type;
    private int fuel;
    private FuelType fuelType;
    private boolean isBreakDown;

    public enum EngineType {
        V6, V8, V12
    }

    public enum FuelType {
        DIESEL, GASOLINE
    }

    public EngineData() {
    }

    public EngineData(EngineData copy) {
        this(copy.isRunning, copy.type, copy.fuel, copy.fuelType, copy.isBreakDown);
    }

    public EngineData(boolean isRunning, EngineType type, int fuel, FuelType fuelType, boolean isBreakDown) {
        this.isRunning = isRunning;
        this.type = type;
        this.fuel = fuel;
        this.fuelType = fuelType;
        this.isBreakDown = isBreakDown;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public EngineType getType() {
        return type;
    }

    public void setType(EngineType type) {
        this.type = type;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isBreakDown() {
        return isBreakDown;
    }

    public void setBreakDown(boolean breakDown) {
        isBreakDown = breakDown;
    }

    @Override
    public String toString() {
        return "EngineData{" +
                "isRunning=" + isRunning +
                ", type=" + type +
                ", fuel=" + fuel +
                ", fuelType=" + fuelType +
                ", isBreakDown=" + isBreakDown +
                '}';
    }
}
