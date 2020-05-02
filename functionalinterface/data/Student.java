package io.dowlath.javahidden.functionalinterface.data;

import io.dowlath.javahidden.stream.Bike;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Student {

    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;
    List<String> activities = new ArrayList<>();
    private int noteBooks;
    private Optional<Bike> optionalBike = Optional.empty();

    public Optional<Bike> getOptionalBike() {
        return optionalBike;
    }

    public void setOptionalBike(Optional<Bike> optionalBike) {
        this.optionalBike = optionalBike;
    }

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities, int noteBooks, Optional<Bike> optionalBike) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
        this.noteBooks = noteBooks;
        this.optionalBike = optionalBike;
    }

    // Fix for Suppler - Constructor reference
    public Student(){

    }

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities, int noteBooks) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
        this.noteBooks = noteBooks;
    }

    // Fix for single argument for Function Constructor reference.
    public Student(String student) {
        this.name = student;
    }

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void printActivities(){
        System.out.println(activities);
    }
    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public int getNoteBooks() {
        return noteBooks;
    }

    public void setNoteBooks(int noteBooks) {
        this.noteBooks = noteBooks;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", gpa=" + gpa +
                ", gender='" + gender + '\'' +
                ", activities=" + activities +
                ", noteBooks=" + noteBooks +
                ", optionalBike=" + optionalBike +
                '}';
    }
}
