package io.dowlath.javahidden.java8default;

import io.dowlath.javahidden.stream.Student;
import io.dowlath.javahidden.stream.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

// Comparator chaning.....
public class SortByNameUsingListSort {
    static Consumer<Student> studentConsumer = student -> System.out.println(student);
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
    static Comparator<Student> gradeLevelComparator = Comparator.comparingDouble(Student::getGradeLevel);
    public static void sortByName(List<Student> studentList){
        System.out.println("After Sort ... :");
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    public static void sortByGPA(List<Student> studentList){
        System.out.println("After Sort GPA... :");
        studentList.sort(gpaComparator);
        studentList.forEach(studentConsumer);
    }

    // Comparator chaining....
    public static void sortByGradeLevel(List<Student> studentList){
        System.out.println("Grade level and Name (Comparator Chaining ... :");
        studentList.sort(gradeLevelComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        //System.out.println("Before Sort .... :");
        // studentList.forEach(studentConsumer);
        //sortByName(studentList);
        // sortByGPA(studentList);
        // This below method is comparator chaining.
        sortByGradeLevel(studentList);
    }
}
