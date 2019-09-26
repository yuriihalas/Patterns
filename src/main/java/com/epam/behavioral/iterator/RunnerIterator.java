package com.epam.behavioral.iterator;

import com.epam.behavioral.iterator.logic.Iterator;
import com.epam.behavioral.iterator.model.Human;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunnerIterator {
    private static final Logger LOG = LogManager.getLogger(RunnerIterator.class);

    public static void main(String[] args) {
        String[] friends = {"Igor", "Losha", "Kenny", "Andrew"};
        String name = "Roman";
        Human human = new Human(name, friends);
        Iterator iterator = human.getIterator();

        LOG.info("Human with name: " + human.getName());
        LOG.info("Has friends: ");
        while(iterator.hasNext()){
            LOG.info(iterator.next());
        }
    }
}
