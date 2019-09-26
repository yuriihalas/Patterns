package com.epam.behavioural.observer;

import com.epam.behavioural.observer.listener.EmailListener;
import com.epam.behavioural.observer.listener.PhoneMessageListener;
import com.epam.behavioural.observer.listener.TelegramListener;
import com.epam.behavioural.observer.manager.NotifyManager;
import com.epam.behavioural.observer.news.News;
import com.epam.behavioural.observer.user.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;

public class RunnerObserver {
    private static final Logger LOG = LogManager.getLogger(RunnerObserver.class);

    public static void main(String[] args) {
        User user1 = new User("Yankee");
        user1.setEmail("yanke123@gmail.com");
        user1.setMobileNum("+380932353968");

        User user2 = new User("Kozak");
        user2.setEmail("kozak3121@gmail.com");
        user2.setMobileNum("+376567597486");

        NotifyManager notifyManager = new NotifyManager();
        EmailListener emailListener;
        PhoneMessageListener phoneMessageListener;
        TelegramListener telegramListener;

        emailListener = new EmailListener(user1);
        notifyManager.subscribe(emailListener);

        emailListener = new EmailListener(user2);
        notifyManager.subscribe(emailListener);

        phoneMessageListener = new PhoneMessageListener(user1);
        notifyManager.subscribe(phoneMessageListener);

        telegramListener = new TelegramListener(user2);
        notifyManager.subscribe(telegramListener);

        LinkedList<String> listNews = new LinkedList<>();
        News news = new News(listNews);
        news.setNotifyManager(notifyManager);
        news.addNews("Today is so sunny, so it's necessary takes your umbrellas");

        notifyManager.unsubscribe(new TelegramListener(user2));
        notifyManager.unsubscribe(new EmailListener(user2));

        news.addNews("Do you heard about accident that was happen in Lviv at LPNU university, please write a comment on our facebook page.");
    }
}
