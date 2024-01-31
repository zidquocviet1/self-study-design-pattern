package com.mqv.creational.builder;

public class Main {
    public static void main(String[] args) {
        CarState initialState = new CarStateBuilder()
                .windowData(new WindowData(false, false, WindowData.Direction.PULL_PUSH))
                .engineData(new EngineData(true, EngineData.EngineType.V12, 10, EngineData.FuelType.GASOLINE, false))
                .wheelData(new WheelData(true, 36, WheelData.WheelType.ALLOY))
                .build();

        System.out.println("Initial car state: " + initialState);

        CarState carStopWithOpenWindowState = initialState.toBuilder()
                .changeWindowData()
                .isOpen(true)
                .isBreakDown(false)
                .commit()
                .changeWheelData()
                .isWheeling(false)
                .commit()
                .changeEngineData()
                .isRunning(false)
                .build();

        System.out.println("Car stop and then open the door: " + carStopWithOpenWindowState);

        CarState carStopForFillFuel = carStopWithOpenWindowState.toBuilder()
                .changeEngineData()
                .fuel(50)
                .build();

        System.out.println("Car stop for filling gasoline fuel: " + carStopForFillFuel);
    }
}
