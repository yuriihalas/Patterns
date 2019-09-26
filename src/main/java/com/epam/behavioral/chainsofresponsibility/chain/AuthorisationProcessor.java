package com.epam.behavioral.chainsofresponsibility.chain;

import com.epam.behavioral.chainsofresponsibility.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;


public class AuthorisationProcessor implements Chain {
    private static final Logger LOG = LogManager.getLogger(AuthorisationProcessor.class);
    private Chain chain;

    @Override
    public void setNext(Chain chain) {
        this.chain = chain;
    }

    @Override
    public void process(User user) {
        LOG.debug("Authorising user..");
        LOG.debug("User with credentials:");
        LOG.debug("Login: " + user.getLogin());
        LOG.debug("Password: " + user.getPassword());
        if (isUserCorrect(user)) {
            LOG.info("Successfully authorised!");
            chain.process(user);
        } else {
            LOG.warn("Can't be authorised because password and login must not be empty");
        }
    }

    private boolean isUserCorrect(User user) {
        return Objects.nonNull(user) && !user.getPassword().equals("") && !user.getLogin().equals("");
    }
}
