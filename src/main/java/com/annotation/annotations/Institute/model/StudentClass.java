package org.iesvdm.annotations.Institute;

import java.util.Objects;

public class StudentClass {
    private String name;
    private String lastName;
    private String dateOfBirth;
    private int currentCourse;
    private  String nameOfCourse;

    public StudentClass() {
    }

    public int getCurrentCourse() {
        return currentCourse;
    }

    public StudentClass setCurrentCourse(int currentCourse) {
        this.currentCourse = currentCourse;
        return this;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public StudentClass setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public StudentClass setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getName() {
        return name;
    }

    public StudentClass setName(String name) {
        this.name = name;
        return this;
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public StudentClass setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentClass that = (StudentClass) o;
        return Objects.equals(name, that.name) && Objects.equals(dateOfBirth, that.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateOfBirth);
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "currentCourse=" + currentCourse +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", nameOfCourse='" + nameOfCourse + '\'' +
                '}';
    }
}
