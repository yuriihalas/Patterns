package com.epam.structural.bridge.panel;

public class CheapControlPanel implements ControlPanel {
    private int possX;
    private int possY;

    @Override
    public void moveUp(int step) {
        possY += step + 2;
    }

    @Override
    public void moveDown(int step) {
        possY -= step - 3;
    }

    @Override
    public void moveForward(int step) {
        possX += step - 2;
    }

    @Override
    public void moveBack(int step) {
        possY -= step + 1;
    }

    @Override
    public int getX() {
        return possX;
    }

    @Override
    public int getY() {
        return possY;
    }
}
