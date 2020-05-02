package io.dowlath.javahidden.functionalinterface.data;

import io.dowlath.javahidden.stream.Bike;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDataBase {

    public static Supplier<Student> studentSupplier = () -> {
        Bike bike  = new Bike();
        bike.setName("ABC");
        bike.setModel("XYZ");
        Student student = new Student("Dowlath Basha G",2,3.6,"male", Arrays.asList("Swim","BasketBall","VolleyBall"),11);
        student.setOptionalBike(Optional.ofNullable(bike));
        return student;
    };

    public static List<Student> getAllStudents(){
        /* 2nd Grade Students */
        Student student1 = new Student("Dowlath",2,3.6,"male", Arrays.asList("Swim","BasketBall","VolleyBall"),11);
        Student student2 = new Student("Bhavya",2,3.8,"female",Arrays.asList("Swim","Gymnastics","soccer"),12);


        /* 3rd Grade Students */
        Student student3 = new Student("Priya",3,4.0,"female", Arrays.asList("Swim","BasketBall","Aerobics"),10);
        Student student4 = new Student("Arsh",3,3.9,"male",Arrays.asList("Swim","Gymnastics","soccer"),9);


        /* 4th Grade Students */
        Student student5 = new Student("Sowmiya",4,3.5,"female", Arrays.asList("Swim","Dancing","FootBall"),15);
        Student student6 = new Student("Ariz",4,3.9,"male",Arrays.asList("Swim","BasketBall","BaseBall","FootBall"),14);

        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6);
        return students;
    }
}
