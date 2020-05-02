package io.dowlath.javahidden.lambda;

import java.util.Comparator;

public class Comparator_Lambda {
    public static void main(String[] args) {
        // prior java 8
        Comparator<Integer> priorJava8Comparator = new Comparator<>(){
             public int compare(Integer i1, Integer i2){
                 return i1.compareTo(i2); //  0 = i1 == i2 , 1 = i1 > i2 , -1 = i1 < i2
             }
        };
        System.out.println("Prior Java 8 comparator ... : "+ priorJava8Comparator.compare(3,2));
        Comparator<Integer> lambdaComparator = (a,b) -> a.compareTo(b);
        System.out.println("After Java 8 comparator ... : "+ lambdaComparator.compare(3,2));
    }
}
