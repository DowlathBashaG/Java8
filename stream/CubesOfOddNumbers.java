package io.dowlath.javahidden.stream;

import java.util.List;

public class CubesOfOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers =  List.of(2,6,10,3,1,5,9,7);
        printCubesOfOddNumbers(numbers);
    }
    static void printCubesOfOddNumbers(List<Integer> numbers){
        numbers.stream().filter( number -> number % 2 != 0)
                .map(x -> x * x * x)
                .forEach((System.out::println));
    }
}
