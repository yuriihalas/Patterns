package com.epam.behavioral.chainsofresponsibility;

import com.epam.behavioral.chainsofresponsibility.chain.AdminAccessProcess;
import com.epam.behavioral.chainsofresponsibility.chain.AuthorisationProcessor;
import com.epam.behavioral.chainsofresponsibility.chain.Chain;
import com.epam.behavioral.chainsofresponsibility.chain.DeveloperAccessProcess;
import com.epam.behavioral.chainsofresponsibility.model.User;

public class MobileMarket {
    private Chain chain;

    public MobileMarket() {
        chain = new AuthorisationProcessor();
        Chain c2 = new AdminAccessProcess();
        Chain c3 = new DeveloperAccessProcess();
        chain.setNext(c2);
        c2.setNext(c3);
    }

    public void authorise(User user) {
        chain.process(user);
    }
}
