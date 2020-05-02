package io.dowlath.javahidden.optional;

import io.dowlath.javahidden.stream.Bike;
import io.dowlath.javahidden.stream.Student;
import io.dowlath.javahidden.stream.StudentDataBase;

import java.util.Optional;

public class Optional_Flat_Map {
    public static void optionalFlatMap(){
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> name = studentOptional
                                .filter(student -> student.getGpa()>=3.5) // Optional<Student<Optional<Bike>>
                                .flatMap(Student::getOptionalBike) //returns -> Optional<Bike>
                                .map(Bike::getName);
        name.ifPresent(s-> System.out.println("Bike Name ... :"+s));

    }
    public static void main(String[] args) {
        optionalFlatMap();
    }
}
