package io.dowlath.javahidden.optional;

import io.dowlath.javahidden.stream.Student;
import io.dowlath.javahidden.stream.StudentDataBase;

import java.util.Optional;

public class Optional_Filter_Map {
    //filter
    public static void optionalFilter(){
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get()); //Optional<Student>
        studentOptional.filter(student -> student.getGpa() >=3.6)
                        .ifPresent(student -> System.out.println(student));
    }
    //map
    public static void optionalMap(){
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get()); // Optional<Stream>
        if(studentOptional.isPresent()){
            Optional<String> stringOptional = studentOptional
                    .filter(student -> student.getGpa()>=3.5)
                    .map(Student::getName);
            System.out.println(stringOptional.get());

        }
    }

    public static void main(String[] args) {
       // optionalFilter();
        optionalMap();
    }
}
