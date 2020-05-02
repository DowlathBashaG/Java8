package io.dowlath.javahidden.java8default.implInterface;

public interface Interface3 extends Interface2{
    default void methodC(){
        System.out.println("Interface3_methodC"+"   "+Interface3.class);
    }
    default void methodB(){
        System.out.println("Interface3_methodB"+"   "+Interface3.class);
    }
}
