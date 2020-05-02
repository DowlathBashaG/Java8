package io.dowlath.javahidden.datastructures.interview;

public class Pyramid {
    public static void main(String[] args) {
        int n = 10;
        printPyramid(n);
    }
    private static void printPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+ "  ");
            }
            System.out.println(" ");
        }
    }
}
