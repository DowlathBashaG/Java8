package io.dowlath.javahidden.collectors;

import io.dowlath.javahidden.stream.Student;
import io.dowlath.javahidden.stream.StudentDataBase;

import java.util.stream.Collectors;

public class Collectors_Joining_Example {
    private static String joining_1(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }
    private static String joining_2(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }
    private static String joining_3(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-","(",")"));
    }
    public static void main(String[] args) {
        System.out.println("Joing_1..... : "+joining_1());
        System.out.println("Joing_2..... : "+joining_2());
        System.out.println("Joing_3..... : "+joining_3());
    }
}
