package io.dowlath.javahidden.functionalinterface.predicate;

import io.dowlath.javahidden.functionalinterface.data.Student;
import io.dowlath.javahidden.functionalinterface.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class Predicate_Student_Example {
    static Predicate<Student> p1 = s -> s.getGradeLevel() >=3;
    static Predicate<Student> p2 = s -> s.getGpa() >=3.9;

    private static void filterStudentsByGradeLevel(){
        System.out.println("filterStudentsByGradeLevel");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p1.test(student)){
                System.out.println(student);
                }
            }
        );
        System.out.println("\n");
    }

    private static void filterStudentsByGPALevel(){
        System.out.println("filterStudentsByGPALevel");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if(p2.test(student)){
                System.out.println(student);
            }
        });
        System.out.println("\n");
    }

    private static void filterStudents_Negate(){
        System.out.println("filterStudents_Negate");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
                    if(p1.or(p2).negate().test(student)){ // s -> s.getGradeLevel() >=3; s.getGpa() >=3.9;
                        System.out.println(student);
                    }
                    else{
                        System.out.println(student);
                    }
                }
        );
    }

    public static void main(String[] args) {
        filterStudentsByGradeLevel();
        filterStudentsByGPALevel();
        filterStudents_Negate();
    }


}
