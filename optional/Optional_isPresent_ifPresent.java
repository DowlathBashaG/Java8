package io.dowlath.javahidden.optional;

import java.util.Optional;

public class Optional_isPresent_ifPresent {
    public static void main(String[] args) {
        //isPresent - its telling value is present or not
        Optional<String> stringOptional = Optional.ofNullable("Dowlath");
        System.out.println("isPresent...:"+ stringOptional.isPresent());
        if(stringOptional.isPresent()){
            System.out.println("isPresent.. :"+stringOptional.get());
        }

        //ifPresent - but its telling value is present or not and perform more operations
        System.out.print("ifPresent....");
        stringOptional.ifPresent(s -> System.out.println(s));

    }
}
