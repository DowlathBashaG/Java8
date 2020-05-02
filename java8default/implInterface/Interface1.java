package io.dowlath.javahidden.java8default.implInterface;

public interface Interface1 {
    default void methodA(){
        System.out.println("Interface1_methodA"+"   "+ Interface1.class);
    }
}
