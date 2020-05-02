package io.dowlath.javahidden.functionalinterface.consumer;

import java.util.function.Consumer;

public class Consumer_Example {
    /*
        1. It takes one input
        2. accept (T t)
        3. andThen(T t) => it is for consumer chaining.
     */
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        consumer.accept("Dowlath");
    }
}
