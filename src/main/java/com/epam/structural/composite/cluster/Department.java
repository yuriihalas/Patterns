package com.epam.structural.composite.cluster;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Department implements Cluster {
    private static final Logger LOG = LogManager.getLogger(Department.class);
    private int id;
    private String name;
    private int amountStudents;
    private List<Group> groups;

    public Department(int id, String name, List<Group> groups) {
        this.name = name;
        this.id = id;
        this.groups = groups;
        this.amountStudents = groups.stream().map(Group::getAmountOfPeople).mapToInt(Integer::valueOf).sum();
    }

    @Override
    public int getAmountOfPeople() {
        return this.amountStudents;
    }

    @Override
    public void showNames() {
        LOG.info("Group NAMES");
        this.groups.forEach(g -> LOG.info(g.getName()));
        this.groups.forEach(Group::showNames);
    }

    @Override
    public void showIds() {
        LOG.info("Group IDS");
        this.groups.forEach(g -> LOG.info(g.getId()));
        this.groups.forEach(Group::showIds);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amountStudents=" + amountStudents +
                ", groups=" + groups +
                '}';
    }
}
