package com.epam.behavioral.observer.news;

import com.epam.behavioral.observer.manager.NotifyManager;

import java.util.List;
import java.util.Objects;

public class News {
    private List<String> news;
    private NotifyManager notifyManager;

    public News(List<String> news) {
        this.news = news;
    }

    public void setNotifyManager(NotifyManager notifyManager) {
        this.notifyManager = notifyManager;
    }

    public void addNews(String news) {
        if(Objects.nonNull(notifyManager)) {
            notifyManager.notifySubscribers(news);
        }
        this.news.add(news);
    }

    public List<String> getNews() {
        return this.news;
    }
}
