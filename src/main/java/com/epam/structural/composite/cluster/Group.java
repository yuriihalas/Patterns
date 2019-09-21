package com.epam.structural.composite.cluster;

import com.epam.structural.composite.model.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Group implements Cluster {
    private static final Logger LOG = LogManager.getLogger(Group.class);
    private int id;
    private String name;
    private int amountStudents;
    private List<Student> students;

    public Group(int id, String name, List<Student> students) {
        this.id = id;
        this.name = name;
        this.students = students;
        this.amountStudents = students.size();
    }

    @Override
    public int getAmountOfPeople() {
        return amountStudents;
    }

    @Override
    public void showNames() {
        LOG.info("STUDENTS NAMES");
        this.students.forEach(s -> LOG.info(s.getName()));
    }

    @Override
    public void showIds() {
        LOG.info("STUDENTS IDS");
        this.students.forEach(s -> LOG.info(s.getId()));
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
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amountStudents=" + amountStudents +
                ", students=" + students +
                '}';
    }
}
