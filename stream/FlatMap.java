package io.dowlath.javahidden.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* Its flattening one type to another type
   Collection<Collection<T>> to Collection<T>
   List<List<Integer>>  to List<Integer>>
*/
public class FlatMap {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);
        List<List<Integer>> listOfIntegers = Arrays.asList(list1,list2,list3);
        List<Integer> listOfAllIntegers = listOfIntegers.stream()
                                           //.flatMap(x -> x.stream()) // (or) flatMap(List::stream)
                                           .flatMap(List::stream)
                                           .collect(Collectors.toList());
        System.out.println(listOfAllIntegers);


    }
}
