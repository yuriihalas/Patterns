package com.epam.behavioral.chainsofresponsibility.chain;

import com.epam.behavioral.chainsofresponsibility.model.User;

public interface Chain {
    void setNext(Chain chain);
    void process(User user);
}
