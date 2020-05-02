package io.dowlath.javahidden.java8default.implInterfaceConflicts;

public interface Interface1 {
    default void methodA(){
        System.out.println("Interface1-methodA"+"  "+Interface1.class);
    }
}
