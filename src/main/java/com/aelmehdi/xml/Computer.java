package com.aelmehdi.xml;

public class Computer {
    private Screen screen;

    public void gotScreen() {
        screen.brand();
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }
}