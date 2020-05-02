package io.dowlath.javahidden.interview;

import java.util.ArrayList;
import java.util.List;

public class ListFinalTest {
    final static List<String> finalList = new ArrayList();
    static List<String> nonFinalList = new ArrayList<>();
    public static void main(String[] args) {
        nonFinalList.add("Dowlath");
        nonFinalList.add("Basha");
        nonFinalList.add("G");
        finalList.add("A");
        finalList.add(null);
        finalList.add("B");
        finalList.add("C");
        finalList.add("");        //nonFinalList = finalList;
       // finalList = nonFinalList;
        System.out.println(finalList);
        System.out.println(nonFinalList);
    }

}
