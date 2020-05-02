package io.dowlath.javahidden.functionalinterface.function;

public class Function_Example_1 {
    private static String performConcate(String str){
        return Function_Example.addSomeString.apply(str);
    }
    public static void main(String[] args) {
        String result = performConcate("Hello ");
        System.out.println("The Result ... :"+ result);
    }
}
