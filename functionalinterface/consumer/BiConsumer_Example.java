package io.dowlath.javahidden.functionalinterface.consumer;

import io.dowlath.javahidden.functionalinterface.data.Student;
import io.dowlath.javahidden.functionalinterface.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumer_Example {
    /*
       1. It takes two inputs
       2. accept (T t, U u)
       3. andThen(T t) => it is for consumer chaining.
    */

    public static void printNameAndActivities() {
        BiConsumer<String,List<String>> biConsumer = (name,activities) -> System.out.println(name +" : "+ activities);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> biConsumer.accept(student.getName(),student.getActivities())));
    }
    public static void main(String[] args) {
        BiConsumer<String, String> printName = (a, b) -> {
            System.out.println(a + "  " + b);
        };
        printName.accept("Dowlath", "Basha G");


        BiConsumer<Integer, Integer> addConsumer = (a, b) -> {
            System.out.println("Addition .. :" + (a + b));
        };
        BiConsumer<Integer, Integer> subConsumer = (a, b) -> {
            System.out.println("Subtraction ... :"+(a - b));
        };
        BiConsumer<Integer, Integer> multiplyConsumer = (a, b) -> {
            System.out.println("Multiplication ... :"+(a * b));
        };
        BiConsumer<Integer, Integer> devisionConsumer = (a, b) -> {
            System.out.println("Division ... :"+(a / b));
        };
        //addConsumer.accept(10,5);
        addConsumer.andThen(multiplyConsumer).andThen(devisionConsumer).andThen(subConsumer).accept(10,5);

        //print Name & Activities
        printNameAndActivities();

    }
}