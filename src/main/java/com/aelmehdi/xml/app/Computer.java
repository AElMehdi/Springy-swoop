package com.aelmehdi.xml;

public class Computer {
    private Screen screen;

    private HardDrive hardDrive;

    public void gotScreen() {
        screen.brand();
    }

    public void hardDriveSize() {
        hardDrive.printSize();
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public HardDrive getHardDrive() {
        return this.hardDrive;
    }

    public void init() {
        System.out.println("Computer init method");
    }

    public void destroy() {
        System.out.println("Computer destroy method");
    }
}