package io.dowlath.javahidden.optional;

import io.dowlath.javahidden.stream.Student;
import io.dowlath.javahidden.stream.StudentDataBase;

import java.util.Optional;

public class Optional_OrElse_OrElseGet_OrElseThrow {
    //orElse  ( accepts the String )
    public static String optionalOrElse(){
       // Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        //How Default will print
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }
    //orElseGet ( accepts the Supplier )
    public static String optionalOrElseGet(){
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        //How Default will print
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseGet(() ->"Default");
        return name;
    }
    //orElseThrow ( accepts the Supplier )
    public static String optionalOrElseThrow(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        //How Default will print
       // Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseThrow(() -> new RuntimeException("Nd data avialable"));
        return name;
    }
    public static void main(String[] args) {
        //orElse
        System.out.println("orElse .... :"+optionalOrElse());
        //orElseGet
        System.out.println("orElseGet .... :"+optionalOrElseGet());
        //orElseThrow
        System.out.println("orElseThrow .... :"+optionalOrElseThrow());
    }

}
