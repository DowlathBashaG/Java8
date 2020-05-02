package io.dowlath.javahidden.stream;

import java.util.List;

public class Distinct_Elements {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,7,3,3,2,5,8,5,4,6,8);
        printOnlyDistinctNumbers(numbers);
    }
    private static void printOnlyDistinctNumbers(List<Integer> numbers){
        numbers.stream().sorted()
                .distinct()
                .forEach((System.out::println));
    }
}
