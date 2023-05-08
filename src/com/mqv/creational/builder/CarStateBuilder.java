package com.mqv.creational.builder;

public class CarStateBuilder {
    private final CarState toBuild;

    public CarStateBuilder() {
        this(new CarState());
    }

    public CarStateBuilder(CarState toBuild) {
        this.toBuild = toBuild;
    }

    public EngineDataBuilder changeEngineData() {
        return new EngineDataBuilder();
    }

    public WindowDataBuilder changeWindowData() {
        return new WindowDataBuilder();
    }

    public WheelDataBuilder changeWheelData() {
        return new WheelDataBuilder();
    }

    public CarStateBuilder wheelData(WheelData wheelData) {
        this.toBuild.setWheelData(wheelData);
        return this;
    }

    public CarStateBuilder engineData(EngineData engineData) {
        this.toBuild.setEngineData(engineData);
        return this;
    }

    public CarStateBuilder windowData(WindowData windowData) {
        this.toBuild.setWindowData(windowData);
        return this;
    }

    public CarState build() {
        return this.toBuild;
    }

    public CarState terminate() {
        this.toBuild.setWindowData(new WindowData());
        this.toBuild.setEngineData(new EngineData());
        this.toBuild.setWheelData(new WheelData());

        return this.toBuild;
    }

    public class EngineDataBuilder {
        private final EngineData engineData;

        public EngineDataBuilder() {
            this.engineData = new EngineData(CarStateBuilder.this.toBuild.getEngineData());
        }

        public EngineDataBuilder isRunning(boolean isRunning) {
            this.engineData.setRunning(isRunning);
            return this;
        }

        public EngineDataBuilder type(EngineData.EngineType type) {
            this.engineData.setType(type);
            return this;
        }

        public EngineDataBuilder fuel(int currentFuel) {
            this.engineData.setFuel(currentFuel);
            return this;
        }

        public EngineDataBuilder fuelType(EngineData.FuelType fuelType) {
            this.engineData.setFuelType(fuelType);
            return this;
        }

        public EngineDataBuilder isBreakDown(boolean isBreakDown) {
            this.engineData.setBreakDown(isBreakDown);
            return this;
        }

        public CarStateBuilder commit() {
            CarStateBuilder.this.toBuild.setEngineData(this.engineData);
            return CarStateBuilder.this;
        }

        public CarState build() {
            commit();
            return CarStateBuilder.this.toBuild;
        }
    }

    public class WindowDataBuilder {
        private final WindowData windowData;

        public WindowDataBuilder() {
            this.windowData = new WindowData(CarStateBuilder.this.toBuild.getWindowData());
        }

        public WindowDataBuilder isOpen(boolean isOpen) {
            this.windowData.setOpen(isOpen);
            return this;
        }

        public WindowDataBuilder isBreakDown(boolean isBreakDown) {
            this.windowData.setBreakDown(isBreakDown);
            return this;
        }

        public WindowDataBuilder direction(WindowData.Direction direction) {
            this.windowData.setDirection(direction);
            return this;
        }

        public CarStateBuilder commit() {
            CarStateBuilder.this.toBuild.setWindowData(this.windowData);
            return CarStateBuilder.this;
        }

        public CarState build() {
            commit();
            return CarStateBuilder.this.toBuild;
        }
    }

    public class WheelDataBuilder {
        private final WheelData wheelData;

        public WheelDataBuilder() {
            this.wheelData = new WheelData(CarStateBuilder.this.toBuild.getWheelData());
        }

        public WheelDataBuilder isWheeling(boolean isWheeling) {
            this.wheelData.setWheeling(isWheeling);
            return this;
        }

        public WheelDataBuilder size(int size) {
            this.wheelData.setSize(size);
            return this;
        }

        public WheelDataBuilder type(WheelData.WheelType type) {
            this.wheelData.setType(type);
            return this;
        }

        public CarStateBuilder commit() {
            CarStateBuilder.this.toBuild.setWheelData(this.wheelData);
            return CarStateBuilder.this;
        }

        public CarState build() {
            commit();
            return CarStateBuilder.this.toBuild;
        }
    }
}
