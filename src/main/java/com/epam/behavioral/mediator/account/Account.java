package com.epam.behavioral.mediator.account;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Account {
    private Mediator mediator;
    private User user;
    private Set<Account> friends;
    private List<String> accountNews;

    public Account(User user, Mediator mediator) {
        this.mediator = mediator;
        this.user = user;
        accountNews = new ArrayList<>();
        friends = new HashSet<>();
    }

    public void addFriend(Account account) {
        mediator.addFriend(this, account);
        mediator.addFriend(account, this);
    }

    public void removeFriend(Account account) {
        mediator.removeFriend(this, account);
        mediator.removeFriend(account, this);
    }

    public void postNews(String news) {
        mediator.postNews(this, news);
    }

    public void showNewsFriends() {
        mediator.showNewsFriends(this);
    }

    public void showMyAccountPostedNews() {
        mediator.showMyAccountPostedNews(this);
    }

    public Mediator getMediator() {
        return mediator;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Account> getFriends() {
        return friends;
    }

    public void setFriends(Set<Account> friends) {
        this.friends = friends;
    }

    public List<String> getAccountNews() {
        return accountNews;
    }

    public void setAccountNews(List<String> accountNews) {
        this.accountNews = accountNews;
    }
}
