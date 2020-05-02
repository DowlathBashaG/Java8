package io.dowlath.javahidden.functionalinterface;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeway_sum_01 {
    public static void main(String[] args) {
        // Imperative way
        int sum =0;
        for(int i=0;i<=100;i++){
            sum +=i;
        }
        System.out.println("Imperative way ... : "+ sum);

        // Declartive way
        int sumDeclartive  = IntStream.rangeClosed(0,100).sum();
        System.out.println("Declarative way ... : "+sumDeclartive);

        // if it is multi thread - concurrent env use parallel.
        int sumDeclarativeParallel  = IntStream.rangeClosed(0,100).parallel().sum();
        System.out.println("Declarative way if multi-thread ... : "+sumDeclarativeParallel);


    }
}
