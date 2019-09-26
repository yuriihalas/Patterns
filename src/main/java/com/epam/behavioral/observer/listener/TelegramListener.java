package com.epam.behavioral.observer.listener;

import com.epam.behavioral.observer.user.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TelegramListener extends NewsListener {
    private static final Logger LOG = LogManager.getLogger(PhoneMessageListener.class);

    public TelegramListener(Consumer consumer) {
        super(consumer);
    }

    @Override
    public void update(String news) {
        LOG.debug(String.format("Notify by telegram with phone number: %s", super.getConsumer().getMobileNum()));
        LOG.debug(String.format("News: %s", news));
    }
}
