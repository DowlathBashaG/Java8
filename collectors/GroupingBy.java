package io.dowlath.javahidden.collectors;

import io.dowlath.javahidden.stream.Student;
import io.dowlath.javahidden.stream.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.*;

public class GroupingBy {
    public static void groupStudentByGender(){
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                                                    .collect(groupingBy(Student::getGender));
        System.out.println(studentMap);
    }
    public static void customizedGroupBy(){
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE" ));
        System.out.println(studentMap);
    }
    public static void twoLevelGroupBySummingInt(){
        Map<Integer, Integer> studentMap = StudentDataBase.getAllStudents()
                                     .stream()
                                     .collect(groupingBy(Student::getGradeLevel,
                                              summingInt(Student::getNoteBooks)));
        System.out.println(studentMap);
    }
    public static void twoLevelGroupByUsingNameSummingInt(){
        Map<String, Integer> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,
                        summingInt(Student::getNoteBooks)));
        System.out.println(studentMap);
    }
    public static void calculateTopGpa(){
       Map<Integer, Optional<Student>> studentMapOptioanl = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,maxBy(Comparator.comparing(Student::getGpa))));

        System.out.println(studentMapOptioanl);

    }
    public static void main(String[] args) {
        //groupStudentByGender();
       // customizedGroupBy();
        //twoLevelGroupBy();
       // twoLevelGroupBySummingInt();
        twoLevelGroupByUsingNameSummingInt();
        calculateTopGpa();
    }
}
