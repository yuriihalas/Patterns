package com.epam.behavioural.mediator;

import com.epam.behavioural.mediator.account.Account;
import com.epam.behavioural.mediator.account.AccountMediator;
import com.epam.behavioural.mediator.account.User;

public class RunnerMediator {
    public static void main(String[] args) {
        AccountMediator mediator = new AccountMediator();
        User user1 = new User("Sasha", "Dembitskii", 25);
        User user2 = new User("Roman", "Tkachenko", 13);
        Account account1 = new Account(user1, mediator);
        Account account2 = new Account(user2, mediator);
        account1.addFriend(account2);

        account1.postNews("Ohh, it's my first day at Lviv, this is really amazing..");
        account2.showNewsFriends();

        account2.postNews("Hi all, how are u?");
        account1.showNewsFriends();

        account1.postNews("Hi subscribers, i think i will return to Lviv soon, bye..");
        account2.showNewsFriends();

        account1.showMyAccountPostedNews();

        account2.removeFriend(account1);
        account1.showNewsFriends();
    }
}
