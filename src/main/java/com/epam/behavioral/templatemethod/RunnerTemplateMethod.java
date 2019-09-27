package com.epam.behavioral.templatemethod;

import com.epam.behavioral.templatemethod.droid.MedicalDroid;
import com.epam.behavioral.templatemethod.droid.MilitaryDroid;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunnerTemplateMethod {
    private static final Logger LOG = LogManager.getLogger(RunnerTemplateMethod.class);

    private static int random() {
        return (int) (Math.random() * 2);
    }

    public static void main(String[] args) {
        MedicalDroid medicalDroid = new MedicalDroid(100, 2);
        MilitaryDroid militaryDroid = new MilitaryDroid(80, 1);

        while (true) {
            LOG.info("Military droid was attacked by medical: ");
            medicalDroid.attack(militaryDroid);
            LOG.info("Military droid hp: " + militaryDroid.getHp());
            LOG.info("____________________________________________");
            LOG.info("Medical droid was attacked by medical: ");
            militaryDroid.attack(medicalDroid);
            LOG.info("Medical droid hp: " + medicalDroid.getHp());
            if (random() == 1) {
                militaryDroid.ultimateAbility();
                LOG.info("Attack increased, now attack is: " + militaryDroid.getAttack());
            } else {
                medicalDroid.ultimateAbility();
                LOG.info("Health increased, now health is: " + medicalDroid.getHp());
            }
            LOG.info("*********************************************");
            LOG.info("*********************************************");
            if (medicalDroid.getHp() <= 0 || militaryDroid.getHp() <= 0) {
                LOG.info("__________________________________________");
                LOG.info("***GAME OVER***");
                String winner = medicalDroid.getHp() <= 0 ? "Military Droid" : "Medical Droid";
                LOG.info("***WINNER: " + winner + "***");
                break;
            }
        }
    }
}
