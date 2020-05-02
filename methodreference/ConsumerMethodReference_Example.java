package io.dowlath.javahidden.methodreference;

import io.dowlath.javahidden.functionalinterface.data.Student;
import io.dowlath.javahidden.functionalinterface.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReference_Example {
     /*
        ClassName::methodName
     */
    static Consumer<Student> c1 = p -> System.out.println(p);
    /*
        ClassName::instanceMethodName;
     */
    static Consumer<Student> c2 = Student::printActivities;
    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c2);
    }
}
