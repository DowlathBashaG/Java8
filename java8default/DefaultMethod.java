package io.dowlath.javahidden.java8default;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultMethod {
    public static void main(String[] args) {
        List<String> listOfNames = Arrays.asList("Dowlath","Arsh","Ariz","Naveeda");
        // Prior Java 8 Sorting.....
        //Collections.sort(listOfNames);
        //System.out.println("Sorted list using Collections.sort()... :" + listOfNames);
        // In Java 8 List interface itself having sort method
        listOfNames.sort(Comparator.naturalOrder());
        System.out.println("Sorted list using List sort()... :" + listOfNames);
        listOfNames.sort(Comparator.reverseOrder());
        System.out.println("Sorted list using List reverse order()... :" + listOfNames);

    }



}
