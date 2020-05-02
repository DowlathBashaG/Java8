package io.dowlath.javahidden.java8default.implInterface;

public class Interface_Client_Default_Overridden implements Interface1,Interface2,Interface3 {
    public void methodA(){
        System.out.println("Interface_Client_Default_Overridden_methodA"+"   "+ Interface_Client_Default_Overridden.class);
    }
    // 1 -> class the implements the interface
    // 2 -> the sub interface that extends the interface
    public static void main(String[] args) {
        Interface_Client_Default_Overridden defaultOverridden = new Interface_Client_Default_Overridden();
        defaultOverridden.methodA(); // resolve the child implementation
        defaultOverridden.methodB();
        defaultOverridden.methodC();
    }
}
