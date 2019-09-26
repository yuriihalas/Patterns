package com.epam.behavioural.observer.listener;

import com.epam.behavioural.observer.user.Consumer;

import java.util.Objects;

public abstract class NewsListener {
    private Consumer consumer;

    public NewsListener(Consumer consumer) {
        this.consumer = consumer;
    }

    public abstract void update(String news);

    public Consumer getConsumer() {
        return consumer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsListener that = (NewsListener) o;
        return Objects.equals(consumer, that.consumer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consumer);
    }
}
