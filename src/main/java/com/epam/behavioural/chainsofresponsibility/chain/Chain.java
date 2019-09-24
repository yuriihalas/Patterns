package com.epam.behavioural.chainsofresponsibility.chain;

import com.epam.behavioural.chainsofresponsibility.model.User;

public interface Chain {
    void setNext(Chain chain);
    void process(User user);
}
