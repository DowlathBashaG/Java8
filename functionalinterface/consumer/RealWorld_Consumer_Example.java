package io.dowlath.javahidden.functionalinterface.consumer;


import io.dowlath.javahidden.functionalinterface.data.Student;
import io.dowlath.javahidden.functionalinterface.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class RealWorld_Consumer_Example {
    static Consumer<Student> c1 = student -> System.out.println(student);
    static Consumer<Student> c2 = student -> System.out.print(student.getName());
    static Consumer<Student> c3 = student -> System.out.println(student.getActivities());

    // List of Students
    public static void printStudents(){
        System.out.println("\nprintStudents : ");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c1);
    }
    // Name and Activites
    public static void printNameAndActivities(){
        System.out.println("\nprintNameAndActivities : ");
        List<Student> studentList = StudentDataBase.getAllStudents();
        // Consumer chaining....  ( andThen() )
        studentList.forEach(c2.andThen(c3));
    }

    public static void printNameAndActivitiesUsingCondition(){
        System.out.println("\nprintNameAndActivitiesUsingCondition : ");
        List<Student> studentList = StudentDataBase.getAllStudents();
        // Consumer chaining....  ( andThen() )
        studentList.forEach((student -> {
            if(student.getGradeLevel()>= 3 && student.getGpa()>=3.9){
                c2.andThen(c3).andThen(c1).accept(student);
            }
        }));
    }


    public static void main(String[] args) {
       // printStudents();
       // printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
