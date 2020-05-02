package io.dowlath.javahidden.map;

import io.dowlath.javahidden.stream.Student;
import io.dowlath.javahidden.stream.StudentDataBase;

public class StreamMapFilterReduce_Example {

    private static int noOfBooks(){
      int noOfBooks = StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel() >=3)
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNoteBooks)
                //.reduce(0,(a,b) -> (a+b));
                .reduce(0,Integer::sum);
        return noOfBooks;
    }

    public static void main(String[] args) {
        System.out.println(noOfBooks());
    }

}
