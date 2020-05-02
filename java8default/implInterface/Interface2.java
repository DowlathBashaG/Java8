package io.dowlath.javahidden.java8default.implInterface;

public interface Interface2 extends Interface1{
    default void methodB(){
        System.out.println("Interface2_methodB"+"   "+Interface2.class);
    }
    default void methodA(){
        System.out.println("Interface2_methodA"+"   "+Interface2.class);
    }
}
