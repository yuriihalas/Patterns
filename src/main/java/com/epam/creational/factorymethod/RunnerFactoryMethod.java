package com.epam.creational.factorymethod;

import com.epam.creational.factorymethod.factory.BallPointFactory;
import com.epam.creational.factorymethod.factory.GelPenFactory;
import com.epam.creational.factorymethod.factory.PenFactory;
import com.epam.creational.factorymethod.pen.Pen;

public class RunnerFactoryMethod {
    public static void main(String[] args) {
        PenFactory penFactoryGel = new GelPenFactory();
        Pen pen = penFactoryGel.createPen();
        pen.open();
        pen.write("Hi, how are you?");
        pen.close();

        PenFactory penFactoryBallPoint = new BallPointFactory();
        pen = penFactoryBallPoint.createPen();
        //will throw exception because pen isn't open after closing
        pen.write("Hi all");
    }
}
