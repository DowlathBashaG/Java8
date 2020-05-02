package io.dowlath.javahidden.stream;

import java.util.List;

public class Ex_Print_All_Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,6,32,90,22,12,2,3);
        //printAllNumbers(numbers);
        printAllNumbersWithFunctionalInterface(numbers);

    }

    // Customized Functional Interface
    public static void print(int number){
        System.out.print(number+" ");
    }
    static void printAllNumbers(List<Integer> numbers){
        // Customized Functional Interface....with static print method.(classname::staticmethod)
        numbers.stream().forEach(Ex_Print_All_Numbers::print);
    }
    static void printAllNumbersWithFunctionalInterface(List<Integer> numbers){
        numbers.stream().forEach(System.out::println);
    }

}

