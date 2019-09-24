package com.epam.behavioural.chainsofresponsibility;

import com.epam.behavioural.chainsofresponsibility.chain.AdminAccessProcess;
import com.epam.behavioural.chainsofresponsibility.chain.AuthorisationProcessor;
import com.epam.behavioural.chainsofresponsibility.chain.Chain;
import com.epam.behavioural.chainsofresponsibility.chain.DeveloperAccessProcess;
import com.epam.behavioural.chainsofresponsibility.model.User;

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
