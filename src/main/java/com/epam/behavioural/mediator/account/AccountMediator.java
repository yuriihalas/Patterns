package com.epam.behavioural.mediator.account;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Set;

public class AccountMediator implements Mediator {
    private static final Logger LOG = LogManager.getLogger(AccountMediator.class);

    @Override
    public void addFriend(Account currentAccount, Account addFriend) {
        LOG.debug(String.format("Trying to add friend: %s for User: %s ..", addFriend.getUser(), currentAccount.getUser()));
        Set<Account> friends = currentAccount.getFriends();
        if (friends.add(addFriend)) {
            LOG.debug("Friend successfully added!");
        } else {
            LOG.warn(String.format("Something went wrong, can't add %s for %s, possibly you are already friends..", addFriend.getUser(), currentAccount.getUser()));
        }
        currentAccount.setFriends(friends);
    }

    @Override
    public void removeFriend(Account currentAccount, Account removeFriend) {
        LOG.debug(String.format("Trying to remove friend: %s for User: %s ..", removeFriend.getUser(), currentAccount.getUser()));
        Set<Account> friends = currentAccount.getFriends();
        if (friends.remove(removeFriend)) {
            LOG.debug("Friend successfully removed!");
        } else {
            LOG.warn(String.format("Something went wrong, can't remove this friend:%s for %s, may be you are not friends..", removeFriend.getUser(), currentAccount.getUser()));
        }
        currentAccount.setFriends(friends);
    }

    @Override
    public void postNews(Account currentAccount, String news) {
        LOG.debug(String.format("Trying to post news on account: %s ..", currentAccount.getUser()));
        List<String> oldNews = currentAccount.getAccountNews();
        oldNews.add(news);
        currentAccount.setAccountNews(oldNews);
    }

    @Override
    public void showNewsFriends(Account currentAccount) {
        LOG.debug(String.format("Trying to show all news from friends of account: %s ..", currentAccount.getUser()));
        Set<Account> friends = currentAccount.getFriends();
        if (friends.isEmpty()) {
            LOG.warn("Looks like you don't have any friends, this is so sad..");
        }
        for (Account friend : friends) {
            LOG.info("News from: " + friend.getUser().getName() + " " + friend.getUser().getSurname());
            friend.getAccountNews().forEach(n -> LOG.info("____________________________________________\n" + n));
        }
    }

    @Override
    public void showMyAccountPostedNews(Account currentAccount) {
        LOG.debug(String.format("Trying to show all news from account: %s ..", currentAccount.getUser()));
        currentAccount.getAccountNews().forEach(n -> LOG.info("____________________________________________\n" + n));
    }
}
