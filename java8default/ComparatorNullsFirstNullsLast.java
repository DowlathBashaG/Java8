package io.dowlath.javahidden.java8default;

import io.dowlath.javahidden.stream.Student;
import io.dowlath.javahidden.stream.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ComparatorNullsFirstNullsLast {
    static Consumer<Student> studentConsumer = student -> System.out.println(student);
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);

    public static void sortWithNullsFirst(List<Student> studentList) {
        System.out.println("Sort with nulls first....!!! ");
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }
    public static void sortWithNullsLast(List<Student> studentList) {
        System.out.println("Sort with nulls last....!!! ");
        Comparator<Student> studentComparator = Comparator.nullsLast(nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        sortWithNullsFirst(studentList);
        sortWithNullsLast(studentList);
    }
}
