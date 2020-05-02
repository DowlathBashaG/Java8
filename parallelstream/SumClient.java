package io.dowlath.javahidden.parallelstream;

import java.util.stream.IntStream;

public class SumClient {
    public static void main(String[] args) {
        Sum sum = new Sum();
        IntStream  //1,2,3, ... 1000
                .rangeClosed(1,1000)
                .parallel()
                .forEach(sum::perform); // 500500 Expected result, if it is parallel result is different .
                 // if you have mutal variable dont use parallel stream. in the sum class we have
                 // total is the mutable variable, every concurrent access of parallel stream it will update the value.
                 // so better to avoid parallel stream when you are using mutable variable.
        System.out.println(sum.getTotal());
    }
}
