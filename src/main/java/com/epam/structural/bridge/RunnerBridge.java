package com.epam.structural.bridge;

import com.epam.structural.bridge.panel.CheapControlPanel;
import com.epam.structural.bridge.panel.ControlPanel;
import com.epam.structural.bridge.panel.SamsungControlPanel;
import com.epam.structural.bridge.quadcopter.Quadcopter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunnerBridge {
    private static final Logger LOG = LogManager.getLogger(RunnerBridge.class);

    public static void main(String[] args) {
        ControlPanel controlPanel = new CheapControlPanel();
        Quadcopter quadcopter = new Quadcopter(controlPanel);

        LOG.info("***CHEAP CONTROL PANEL***");
        quadcopter.moveDown(24);
        LOG.info("Poss X: " + quadcopter.getX());
        LOG.info("Poss Y: " + quadcopter.getY());

        quadcopter.moveBack(50);
        LOG.info("Poss X: " + quadcopter.getX());
        LOG.info("Poss Y: " + quadcopter.getY());


        LOG.info("***SAMSUNG CONTROL PANEL***");
        quadcopter = new Quadcopter(new SamsungControlPanel());
        quadcopter.moveDown(24);
        LOG.info("Poss X: " + quadcopter.getX());
        LOG.info("Poss Y: " + quadcopter.getY());

        quadcopter.moveBack(50);
        LOG.info("Poss X: " + quadcopter.getX());
        LOG.info("Poss Y: " + quadcopter.getY());

    }
}
