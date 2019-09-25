package com.epam.behavioural.mediator.account;

public interface Mediator {
    void addFriend(Account currentAccount, Account addFriend);

    void removeFriend(Account currentAccount, Account removeFriend);

    void postNews(Account currentAccount, String news);

    void showNewsFriends(Account currentAccount);

    void showMyAccountPostedNews(Account currentAccount);
}
