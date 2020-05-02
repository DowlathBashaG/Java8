package io.dowlath.javahidden.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeway_removeduplicates_02 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,2,1,3,4,4,5,5,6,7,8,8,8,9,9,10);

        /* Imperative way */
        List<Integer> uniqueList = new ArrayList<>();
        for(Integer i : integerList){
            if(!uniqueList.contains(i)){
                uniqueList.add(i);
            }
        }
        System.out.println("Imperative way ... :  "+ uniqueList);

        /* Declarative way */
        List<Integer> declarativeList = integerList.stream().distinct().collect(Collectors.toList());
        System.out.println("Declarative way ... : "+ declarativeList);

    }
}
