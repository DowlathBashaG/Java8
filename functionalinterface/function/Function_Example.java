package io.dowlath.javahidden.functionalinterface.function;

import java.util.function.Function;

public class Function_Example {
    static Function<String,String> function = name -> name.toUpperCase();
    static Function<String,String> addSomeString = name -> name.toUpperCase().concat("Basha G");

    public static void main(String[] args) {
        System.out.println("Result from function ... : "+function.apply("dowlath"));
        // for andThen() first execute function and then execute for parameter function
        System.out.println("Result from and then ... : "+function.andThen(addSomeString).apply("Dowlath"));
        // for compose() execute parameter function first and then execute next function.
        System.out.println("Result from compose ...  : "+function.compose(addSomeString).apply("Dowlath"));
    }
}
