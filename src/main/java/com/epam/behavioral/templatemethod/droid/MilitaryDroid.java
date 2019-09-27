package com.epam.behavioral.templatemethod.droid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MilitaryDroid extends Droid {
    private static final Logger LOG = LogManager.getLogger(MilitaryDroid.class);
    private double additionalAttack;

    public MilitaryDroid(double hp, double attack) {
        super(hp, attack);
        additionalAttack = 5;
    }

    @Override
    public void ultimateAbility() {
        LOG.info("Ultimate ability of military droid is activated..");
        setAttack(getAttack() + additionalAttack);
    }
}
