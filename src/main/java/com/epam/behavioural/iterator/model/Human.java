package com.epam.behavioural.iterator.model;

import com.epam.behavioural.iterator.logic.Collection;
import com.epam.behavioural.iterator.logic.Iterator;

public class Human implements Collection {
    private String name;
    private String[] nameFriends;

    public Human(String name, String[] nameFriends) {
        this.name = name;
        this.nameFriends = nameFriends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getNameFriends() {
        return nameFriends;
    }

    public void setNameFriends(String[] nameFriends) {
        this.nameFriends = nameFriends;
    }

    @Override
    public Iterator getIterator() {
        return new FriendsIterator();
    }

    private class FriendsIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < nameFriends.length;
        }

        @Override
        public Object next() {
            return nameFriends[index++];
        }
    }
}
