package io.dowlath.javahidden.java8default;

import java.util.Arrays;
import java.util.List;

public class MultiplierMain {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,3,5);
        Multiplier multiplier = new MultiplierImpl();
        System.out.println("The Result is ... :"+ multiplier.multiply(integerList));
        System.out.println("The Default Result is ... :"+ multiplier.size(integerList));
        System.out.println("The Static Result is ... :"+ Multiplier.isEmpty(integerList));

    }


}
