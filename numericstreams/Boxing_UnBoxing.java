package io.dowlath.javahidden.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Boxing_UnBoxing {
    private static List<Integer> boxing(){
        return IntStream.rangeClosed(1,6)
                .boxed() // int to wrapper
                .collect(Collectors.toList());
    }

    private static int unBoxing(List<Integer> integerList){
        return integerList.stream()
                 // Wrapper Integer values
                .mapToInt(Integer::intValue)  // intstream (intValue of teh wrapper class)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("Boxing .... "+ boxing());
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        System.out.println("Un-Boxing .... "+ unBoxing(integerList));
    }
}
