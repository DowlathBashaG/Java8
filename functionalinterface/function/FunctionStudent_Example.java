package io.dowlath.javahidden.functionalinterface.function;

import io.dowlath.javahidden.functionalinterface.data.Student;
import io.dowlath.javahidden.functionalinterface.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudent_Example {
    static Function<List<Student>, Map<String,Double>> studentFunction = (students -> {
                Map<String,Double> studentGradeMap = new HashMap<>();
                students.forEach((student -> {
                    if(Predicate_Student_Example.p1.test(student)){
                        studentGradeMap.put(student.getName(),student.getGpa());
                    }
                }));
                return studentGradeMap;
            });
    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
