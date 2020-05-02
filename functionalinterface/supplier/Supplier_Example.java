package io.dowlath.javahidden.functionalinterface.supplier;

import io.dowlath.javahidden.functionalinterface.data.Student;
import io.dowlath.javahidden.functionalinterface.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Supplier_Example {
    // Supplier => you dont need to pass any inputs just get the values using get function.
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> {
           return new Student("Dowlath",2,3.6,"male", Arrays.asList("Swim","BasketBall","VolleyBall"));
        };
        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();

        System.out.println("Student is .... : "+ studentSupplier.get());
        System.out.println("\n");
        System.out.println("Student List is .... : "+ listSupplier.get());
    }
}
