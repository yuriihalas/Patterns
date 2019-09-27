package com.epam.behavioral.state.alarm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SilentAlarm implements AlarmClockState {
    private static final Logger LOG = LogManager.getLogger(SilentAlarm.class);

    @Override
    public void inform() {
        LOG.info("Silent alarm");
    }
}
