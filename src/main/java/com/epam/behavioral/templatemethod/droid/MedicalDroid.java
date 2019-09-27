package com.epam.behavioral.templatemethod.droid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MedicalDroid extends Droid {
    private static final Logger LOG = LogManager.getLogger(MedicalDroid.class);
    private double extraHp;

    public MedicalDroid(double hp, double attack) {
        super(hp, attack);
        extraHp = 100;
    }

    @Override
    public void ultimateAbility() {
        LOG.info("Ultimate ability of medical droid is activated..");
        setHp(getHp() + extraHp);
    }
}
