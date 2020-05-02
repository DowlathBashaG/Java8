package io.dowlath.javahidden.java8default.implInterfaceConflicts;

public class SameMethodInterface_Conflicts implements Interface1,Interface2{
   /*
       If two methods are same in the interface when you are invoking
       in your client it will give compiler error.
       How to resolve?
       you need to override using public method in client class.
       very important you need to override as public method in your client class.
    */
    public void methodA() {
        System.out.println("Inside Method A"+SameMethodInterface_Conflicts.class);
    }

    public static void main(String[] args) {
        SameMethodInterface_Conflicts conflicts = new SameMethodInterface_Conflicts();
        conflicts.methodA();
    }
}
