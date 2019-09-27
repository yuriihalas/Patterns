package com.epam.behavioral.state.alarm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MusicAlarm implements AlarmClockState {
    private static final Logger LOG = LogManager.getLogger(MusicAlarm.class);
    private String music;

    public MusicAlarm(String music) {
        this.music = music;
    }

    @Override
    public void inform() {
        LOG.info(String.format("Alarm with music %s", music));
    }
}
