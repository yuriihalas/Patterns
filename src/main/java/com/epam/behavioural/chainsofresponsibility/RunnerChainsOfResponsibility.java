package com.epam.behavioural.chainsofresponsibility;

import com.epam.behavioural.chainsofresponsibility.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunnerChainsOfResponsibility {
    private static final Logger LOG = LogManager.getLogger(RunnerChainsOfResponsibility.class);

    public static void main(String[] args) {
        User user = new User("fghg12", "3213");
        MobileMarket userProcess = new MobileMarket();
        userProcess.authorise(user);
    }
}
