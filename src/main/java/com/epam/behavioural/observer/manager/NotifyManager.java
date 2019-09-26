package com.epam.behavioural.observer.manager;

import com.epam.behavioural.observer.listener.NewsListener;
import com.epam.behavioural.observer.user.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class NotifyManager {
    private static final Logger LOG = LogManager.getLogger(NotifyManager.class);
    private Map<Consumer, Set<NewsListener>> listeners;

    public NotifyManager() {
        listeners = new HashMap<>();
    }

    public void subscribe(NewsListener newsListener) {
        Consumer user = newsListener.getConsumer();
        LOG.info(String.format("Trying to subscribe user %s", user));
        Set<NewsListener> oldListeners = listeners.get(user);
        if (Objects.isNull(oldListeners)) {
            oldListeners = new HashSet<>();
        }
        oldListeners.add(newsListener);
        listeners.put(user, oldListeners);
        LOG.info("User successfully subscribed!");
    }

    public void unsubscribe(NewsListener listener) {
        Consumer user = listener.getConsumer();
        LOG.info(String.format("Trying to unsubscribe user %s..", user));
        Set<NewsListener> userListeners = listeners.get(user);
        if (Objects.nonNull(userListeners) && userListeners.contains(listener)) {
            LOG.debug("With listeners: ");
            for (NewsListener listener1 : userListeners) {
                LOG.debug(listener1.getClass().getSimpleName());
            }
            removeUserOrListener(userListeners, user, listener);
            LOG.info("Successfully unsubscribe!");
        } else {
            LOG.warn("User don't have this listener, or user don't exist!");
            throw new RuntimeException(String.format("Sorry, but User %s, can't unsubscribe on this listener %s", user, listener.getClass().getSimpleName()));
        }
    }

    private void removeUserOrListener(Set<NewsListener> userListeners, Consumer user, NewsListener listener) {
        userListeners.remove(listener);
        if (userListeners.size() == 0) {
            listeners.remove(user);
            LOG.debug("Removed user.");
        } else {
            listeners.put(user, userListeners);
            LOG.debug(String.format("Removed listener: %s.", listener.getClass().getSimpleName()));
        }
    }

    public void notifySubscribers(String news) {
        for (Consumer user : listeners.keySet()) {
            if (Objects.nonNull(user)) {
                for (NewsListener newsListener : listeners.get(user)) {
                    if (Objects.nonNull(newsListener)) {
                        LOG.trace("________________________________________");
                        newsListener.update(news);
                    }
                }
            }
        }
    }
}
