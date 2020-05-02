package io.dowlath.javahidden.map;

import io.dowlath.javahidden.stream.Student;
import io.dowlath.javahidden.stream.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamsMap_Example {
    private static List<String> namesList(){
       List<String> stringList = StudentDataBase.getAllStudents().stream() // Stream<Student>
                // Student as an input , output String
               .map(Student::getName) // Stream<String>
               .map(String::toUpperCase) // Stream<String> -> upperCase operation on each input
               .collect(toList()); // List<String>
        return stringList;
    }

    private static Set<String> namesSet(){
        Set<String> stringList = StudentDataBase.getAllStudents().stream() // Stream<Student>
                // Student as an input , output String
                .map(Student::getName) // Stream<String>
                .map(String::toUpperCase) // Stream<String> -> upperCase operation on each input
                .collect(toSet()); // List<String>
        return stringList;
    }


    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());
    }
}
