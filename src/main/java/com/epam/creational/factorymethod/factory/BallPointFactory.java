package com.epam.creational.factorymethod.factory;

import com.epam.creational.factorymethod.pen.BallPointPen;
import com.epam.creational.factorymethod.pen.Pen;

public class BallPointFactory implements PenFactory {
    public Pen createPen() {
        return new BallPointPen();
    }
}
