package com.epam.creational.prototype.person;

public class Student extends Person {
    private String universityName;

    public Student() {
    }

    public Student(Student student) {
        super(student);
        this.universityName = student.universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    @Override
    public String toString() {
        return super.toString() +
            ", universityName='" + universityName + '\'';
    }
}
