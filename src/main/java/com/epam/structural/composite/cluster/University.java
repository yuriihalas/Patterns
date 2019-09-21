package com.epam.structural.composite.cluster;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class University implements Cluster {
    private static final Logger LOG = LogManager.getLogger(University.class);
    private int id;
    private String name;
    private int amountStudents;
    private List<Institute> institutes;

    public University(int id, String name, List<Institute> institutes) {
        this.name = name;
        this.id = id;
        this.institutes = institutes;
        this.amountStudents = institutes.stream().map(Institute::getAmountOfPeople).mapToInt(Integer::valueOf).sum();
    }

    @Override
    public int getAmountOfPeople() {
        return this.amountStudents;
    }

    @Override
    public void showNames() {
        LOG.info("University NAME");
        LOG.info(this.name);
        LOG.info("Institute NAMES");
        this.institutes.forEach(g -> LOG.info(g.getName()));
        this.institutes.forEach(Institute::showNames);
    }

    @Override
    public void showIds() {
        LOG.info("Institute IDS");
        this.institutes.forEach(g -> LOG.info(g.getId()));
        this.institutes.forEach(Institute::showIds);
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
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amountStudents=" + amountStudents +
                ", institutes=" + institutes +
                '}';
    }
}
