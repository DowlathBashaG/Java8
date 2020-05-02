package io.dowlath.javahidden.functionalinterface.consumer;

import io.dowlath.javahidden.functionalinterface.data.Student;
import io.dowlath.javahidden.functionalinterface.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

// In this class not using static functions.....

public class Predicate_AND_Consumer_Example {
    Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;
    Predicate<Student> p2 = s -> s.getGpa() >= 3.9;
    BiConsumer<String, List>  studentBiConsumer = (name,activities) -> System.out.println(name +" : "+ activities);
    Consumer<Student> studentConsumer = student -> {
        if(p1.and(p2).test(student)){
            studentBiConsumer.accept(student.getName(),student.getActivities());
        }
    };

    public void printNameAndActivities(List<Student> students){
        students.forEach(studentConsumer);
    }
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new Predicate_AND_Consumer_Example().printNameAndActivities(studentList);
    }
}
