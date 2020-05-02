package io.dowlath.javahidden.datastructures.arrays;

import java.security.spec.RSAOtherPrimeInfo;

public class Fibonnaci {
    public static void main(String[] args) {
        int a = 0,b =1,n=10;
        System.out.print(a+ "  "+ b);
        solution(a,b,n);
    }
    private static void solution(int a,int b, int n){
        int count=0;
        while(count < n){
            count = a + b;
            System.out.print(" "+count);
            a = b;
            b = count;
        }
    }
}
