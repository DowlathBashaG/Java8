package io.dowlath.javahidden.optional;

import java.util.Optional;

public class OptionalOfNullableEmpty {
    public static Optional<String> ofNullable(){
        Optional<String> stringOptional = Optional.ofNullable("Hello");
        return stringOptional;
    }
    public static Optional<String> ofNullableNoValue(){
        Optional<String> stringOptional = Optional.ofNullable(null);
        return stringOptional;
    }
    public static Optional<String> ofWithValue(){
        Optional<String> stringOptional = Optional.of("Hello");
        return stringOptional;
    }
    public static Optional<String> ofNoValue(){
        Optional<String> stringOptional = Optional.of(null);
        return stringOptional;
    }

    public static Optional<String> empty(){
        return Optional.empty();
    }

    public static void main(String[] args) {
        // Its wrapped with Optional.
        //System.out.println(ofNullable());
        // How to get the value...use get() and print the value.
       // System.out.println(ofNullable().get());

       // System.out.println("If no value sent in ofNullable ... :" + ofNullableNoValue());
      //  System.out.println("If no value sent in ofNullable check value is there or not... :" + ofNullableNoValue().isPresent());

       // System.out.println("Of ....with value will get value ..:"+ofWithValue());
       // System.out.println("Of ....without value will get null pointer exception .. :"+ofNoValue() );

        System.out.println("Empty ..:"+empty());


      }

}
