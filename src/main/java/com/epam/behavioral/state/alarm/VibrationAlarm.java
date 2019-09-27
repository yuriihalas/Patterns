package com.epam.behavioral.state.alarm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VibrationAlarm implements AlarmClockState {
    private static final Logger LOG = LogManager.getLogger(VibrationAlarm.class);

    @Override
    public void inform() {
        LOG.info("Vibration alarm");
    }
}
