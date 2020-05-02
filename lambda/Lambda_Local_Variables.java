package io.dowlath.javahidden.lambda;

import java.util.function.Consumer;

public class Lambda_Local_Variables {
    static int value = 4;
    public static void main(String[] args) {
         int i = 10;
        // Same variable can not given,inside the method, need to give another variable name
        // It restricted.
        // Can not modify declared variable inside the bock.How to resolve , using static.
        Consumer<Integer> c1 = i1 -> {
            value++;
            System.out.println(value+ i1);
        };
        c1.accept(5);
    }
}
