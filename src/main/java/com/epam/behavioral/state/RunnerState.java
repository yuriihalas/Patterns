package com.epam.behavioral.state;

import com.epam.behavioral.state.alarm.AlarmClockState;
import com.epam.behavioral.state.alarm.MusicAlarm;
import com.epam.behavioral.state.alarm.SilentAlarm;
import com.epam.behavioral.state.alarm.VibrationAlarm;

public class RunnerState {
    public static void main(String[] args) {
        AlarmClockState state = new MusicAlarm("Boogie Woogie");
        state.inform();
        state = new SilentAlarm();
        state.inform();
        state = new VibrationAlarm();
        state.inform();
    }
}
