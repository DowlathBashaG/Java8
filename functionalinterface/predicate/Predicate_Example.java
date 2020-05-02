package io.dowlath.javahidden.functionalinterface.predicate;

import java.util.function.Predicate;

public class Predicate_Example {
    public static Predicate<Integer> p  = i -> i%2==0; // (i) -> { return i%2 ==0 };
    public static Predicate<Integer> p1 = i -> i%2==0;
    public static Predicate<Integer> p2 = i -> i%5==0;

    public static void predicateAnd(){
        System.out.println("Predicate AND result is : "+ p1.and(p2).test(10) ); // predicate chaning
        System.out.println("Predicate AND result is : "+ p1.and(p2).test((9))  ); // predicate chaning
    }

    public static void predicateOr(){
        System.out.println("Predicate OR result is : "+ p1.or(p2).test(10) ); // predicate chaning
        System.out.println("Predicate OR result is : "+ p1.or(p2).test((8))  ); // predicate chaning
    }

    // reverse ( ie ...if it is true , o/p will give false, if it is false o/p will give true )
    public static void predicateNagate(){
        System.out.println("Predicate NEGATE result is : "+ p1.or(p2).negate().test(8) ); // predicate chaning

    }



    public static void main(String[] args) {
       // System.out.println("Predicate .... : "+ p.test(6));
        predicateAnd();
        predicateOr();
        predicateNagate();
    }

}
