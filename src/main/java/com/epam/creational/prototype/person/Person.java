package com.epam.creational.prototype.person;

public abstract class Person {
    private String name;
    private String surname;

    public Person() {
    }

    public Person(Person person) {
        this.name = person.name;
        this.surname = person.surname;
    }

    public abstract Person clone();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
            ", surname='" + surname + '\'';
    }
}
