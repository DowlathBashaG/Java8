package io.dowlath.javahidden.map;

import io.dowlath.javahidden.stream.Student;
import io.dowlath.javahidden.stream.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamFlatMap_Example {

    public static long printStudentActivitiesCount(){
        long listOfActivitiesCount = StudentDataBase.getAllStudents().stream()  // Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream)   // Stream<String>
                .distinct() // Stream<String> with distinct function performed.
                .count(); //
        return listOfActivitiesCount;
    }

    public static List<String> printStudentActivities(){
        List<String> listOfActivities = StudentDataBase.getAllStudents().stream()  // Stream<Student>
        .map(Student::getActivities) // Stream<List<String>>
        .flatMap(List::stream)   // Stream<String>
        .distinct() // Stream<String> with distinct function performed.
        .sorted()
        .collect(toList()); //
        return listOfActivities;
    }
    public static void main(String[] args) {
        System.out.println("flatMap ... : " +printStudentActivities());
        System.out.println("List of activities count  ... : " +printStudentActivitiesCount());
    }
}
