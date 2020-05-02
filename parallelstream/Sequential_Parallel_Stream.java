package io.dowlath.javahidden.parallelstream;

import io.dowlath.javahidden.stream.Student;
import io.dowlath.javahidden.stream.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Sequential_Parallel_Stream {
    public static List<String> sequentialPrintStudentActivities(){
        long startTime = System.currentTimeMillis();
        List<String> listOfActivities = StudentDataBase.getAllStudents().stream()  // Stream<Student>
                .map(Student::getActivities) // Stream<List<String>> - stateless
                .flatMap(List::stream)   // Stream<String> - stateless
                .distinct() // stateful, Stream<String> with distinct function performed.
                .sorted()  // stateful
                .collect(toList()); //
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in sequential ... : "+(endTime-startTime));
        return listOfActivities;
    }

    public static List<String> parallelPrintStudentActivities(){
        long startTime = System.currentTimeMillis();
        List<String> listOfActivities = StudentDataBase.getAllStudents().stream()  // Stream<Student>
                .parallel()
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream)   // Stream<String>
                .distinct() // Stream<String> with distinct function performed.
                .sorted()
                .collect(toList()); //
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in parallel ... : "+(endTime-startTime));
        return listOfActivities;
    }
    public static void main(String[] args) {
        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();
    }
}
