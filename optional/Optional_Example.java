package io.dowlath.javahidden.optional;

import io.dowlath.javahidden.stream.Student;

import java.util.Optional;

public class Optional_Example {
    public static Optional<String> getStudentNameOptional(){
        // Case 1:
        // Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        // Case 2:
        Optional<Student> studentOptional = Optional.ofNullable(null); // Optional.empty;
        if(studentOptional.isPresent()){
            return studentOptional.map(Student::getName); // Optional<String>
        }
        return Optional.empty(); // Represents an optional with no value.
    }
    public static void main(String[] args) {
       Optional<String>  stringOptional = getStudentNameOptional();

       if(stringOptional.isPresent()){
           System.out.println("Length of the student  .... : "+stringOptional.get().length());
       }else{
           System.out.println("Name Not fount");
       }
    }
}
