package io.dowlath.javahidden.java8default.implInterfaceConflicts;

public interface Interface2 {
    default void methodA(){
        System.out.println("Interface2_methodA"+"   "+ Interface2.class);
    }
}
