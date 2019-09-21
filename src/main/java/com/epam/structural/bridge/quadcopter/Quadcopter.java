package com.epam.structural.bridge.quadcopter;

import com.epam.structural.bridge.panel.ControlPanel;

public class Quadcopter {
    private ControlPanel controlPanel;

    public Quadcopter(ControlPanel panel) {
        this.controlPanel = panel;
    }

    public void moveUp(int step) {
        this.controlPanel.moveUp(step);
    }

    public void moveDown(int step) {
        this.controlPanel.moveDown(step);
    }

    public void moveForward(int step) {
        this.controlPanel.moveForward(step);
    }

    public void moveBack(int step) {
        this.controlPanel.moveBack(step);
    }

    public int getX() {
        return this.controlPanel.getX();
    }

    public int getY() {
        return this.controlPanel.getY();
    }
}
