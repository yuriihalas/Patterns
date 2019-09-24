package com.epam.behavioural.chainsofresponsibility.chain;

import com.epam.behavioural.chainsofresponsibility.model.DeveloperUser;
import com.epam.behavioural.chainsofresponsibility.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class DeveloperAccessProcess implements Chain {
    private static final Logger LOG = LogManager.getLogger(DeveloperAccessProcess.class);
    private Chain chain;

    @Override
    public void setNext(Chain chain) {
        this.chain = chain;
    }

    @Override
    public void process(User user) {
        LOG.debug("Checking if user has access as Developer..");
        if (isDeveloper(user)) {
            LOG.info("Successfully granted access as Developer.");
            LOG.info("Can do something as a Developer, add/delete/update user or do something with goods, or change users access etc.");
            chain.process(user);
        } else {
            LOG.warn("Sorry, but current user, don't has permission as Developer!");
        }
    }

    private boolean isDeveloper(User user) {
        return Arrays.stream(DeveloperUser.values()).anyMatch(u -> u.getLogin().equals(user.getLogin()) &&
            u.getPassword().equals(user.getPassword()));
    }
}
