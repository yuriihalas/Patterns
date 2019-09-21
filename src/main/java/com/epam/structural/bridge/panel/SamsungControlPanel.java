package com.epam.structural.bridge.panel;

import com.epam.structural.bridge.panel.ControlPanel;

public class SamsungControlPanel implements ControlPanel {
    private static final String UNIC_NAME = "This is brand control panel";
    private int possX;
    private int possY;

    @Override
    public void moveUp(int step) {
        possX += step;
    }

    @Override
    public void moveDown(int step) {
        possY -= step;
    }

    @Override
    public void moveForward(int step) {
        possX += step;
    }

    @Override
    public void moveBack(int step) {
        possY -= step;
    }

    @Override
    public int getX() {
        return possX;
    }

    @Override
    public int getY() {
        return possY;
    }

    public String getUnicName() {
        return UNIC_NAME;
    }
}
