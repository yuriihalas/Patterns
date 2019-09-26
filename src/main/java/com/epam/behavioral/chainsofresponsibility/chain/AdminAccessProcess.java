package com.epam.behavioral.chainsofresponsibility.chain;

import com.epam.behavioral.chainsofresponsibility.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AdminAccessProcess implements Chain {
    private static final Logger LOG = LogManager.getLogger(AdminAccessProcess.class);
    private Chain chain;

    @Override
    public void setNext(Chain chain) {
        this.chain = chain;
    }

    @Override
    public void process(User user) {
        LOG.debug("Checking if user has access as Admin..");
        if (user.isAccessToSecurity()) {
            LOG.info("Successfully granted access as Admin.");
            LOG.info("Can do something as a Admin, delete users, change their access etc.");
            chain.process(user);
        } else {
            LOG.warn("Sorry, but current user don't has permission as Admin.");
        }
    }
}
