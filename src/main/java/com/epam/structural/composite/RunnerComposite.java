package com.epam.structural.composite;

import com.epam.structural.composite.cluster.*;
import com.epam.structural.composite.model.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class RunnerComposite {
    private static final Logger LOG = LogManager.getLogger(RunnerComposite.class);

    public static void main(String[] args) {
        Student one = new Student("Yura", 1);
        Student two = new Student("Igor", 2);
        List<Student> students = new ArrayList<>();
        students.add(one);
        students.add(two);

        Group group = new Group(1, "ASU", students);
        List<Group> groups = new ArrayList<>();
        groups.add(group);

        Department department = new Department(1, "ICM", groups);
        List<Department> departments = new ArrayList<>();
        departments.add(department);

        Institute institute = new Institute(1, "IKNI", departments);
        List<Institute> institutes = new ArrayList<>();
        institutes.add(institute);

        University university = new University(1, "LPNU", institutes);
        LOG.info("General amount of students in university: " + university.getAmountOfPeople());
        university.showNames();
        university.showIds();
    }
}
