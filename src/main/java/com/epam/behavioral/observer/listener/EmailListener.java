package com.epam.behavioral.observer.listener;

import com.epam.behavioral.observer.user.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmailListener extends NewsListener {
    private static final Logger LOG = LogManager.getLogger(EmailListener.class);

    public EmailListener(Consumer consumer) {
        super(consumer);
    }

    @Override
    public void update(String news) {
        LOG.debug(String.format("Notify by email: %s", super.getConsumer().getEmail()));
        LOG.debug(String.format("News: %s", news));
    }
}
