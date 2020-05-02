package io.dowlath.javahidden.methodreference;

import java.util.function.Function;

public class FunctionMethodReference_Example {
    static Function<String,String> toUpperCaseLambda = s -> s.toUpperCase();
    static Function<String,String> toUpperCaseMethodReference = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println("To Upper Case Lambda ... : "+ toUpperCaseLambda.apply("Dowlath"));
        System.out.println("To Upper Case Method Reference ... : "+ toUpperCaseMethodReference.apply("Dowlath"));
    }
}
