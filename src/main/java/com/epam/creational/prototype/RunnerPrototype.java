package com.epam.creational.prototype;

import com.epam.creational.prototype.person.Employee;
import com.epam.creational.prototype.person.Person;
import com.epam.creational.prototype.person.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RunnerPrototype {
    private static final Logger LOG = LogManager.getLogger(RunnerPrototype.class);

    public static void main(String[] args) {
        Person person = new Employee();
        person.setSurname("Halas");
        person.setName("Yura");
        ((Employee) person).setPlaceWork("Epam");
        LOG.info("Just created employee: " + person);

        Employee second = (Employee) person.clone();
        LOG.info("Copy of previous employee: " + second);

        Student student = new Student();
        student.setUniversityName("LNU");
        student.setName("Igor");
        student.setSurname("Sas");
        LOG.info("Just created student: " + student);

        Student copyStudent = student.clone();
        LOG.info("Copy of previous student: " + copyStudent);
    }
}
