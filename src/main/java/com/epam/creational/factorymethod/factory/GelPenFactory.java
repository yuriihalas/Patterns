package com.epam.creational.factorymethod.factory;

import com.epam.creational.factorymethod.pen.GelPen;
import com.epam.creational.factorymethod.pen.Pen;

public class GelPenFactory implements PenFactory {
    public Pen createPen() {
        return new GelPen();
    }
}
