package com.epam.structural.bridge.panel;

public interface ControlPanel {
    void moveUp(int step);
    void moveDown(int step);
    void moveForward(int step);
    void moveBack(int step);
    int getX();
    int getY();
}
