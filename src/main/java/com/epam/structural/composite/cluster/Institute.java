package com.epam.structural.composite.cluster;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Institute implements Cluster {
    private static final Logger LOG = LogManager.getLogger(Institute.class);
    private int id;
    private String name;
    private int amountStudents;
    private List<Department> departments;

    public Institute(int id, String name, List<Department> departments) {
        this.id = id;
        this.name = name;
        this.departments = departments;
        this.amountStudents = departments.stream().map(Department::getAmountOfPeople).mapToInt(Integer::valueOf).sum();
    }

    @Override
    public int getAmountOfPeople() {
        return this.amountStudents;
    }

    @Override
    public void showNames() {
        LOG.info("Department NAMES");
        this.departments.forEach(d -> LOG.info(d.getName()));
        this.departments.forEach(Department::showNames);
    }

    @Override
    public void showIds() {
        LOG.info("Department IDS");
        this.departments.forEach(d -> LOG.info(d.getId()));
        this.departments.forEach(Department::showIds);
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
        return "Institute{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amountStudents=" + amountStudents +
                ", departments=" + departments +
                '}';
    }
}
