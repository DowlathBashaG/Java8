package io.dowlath.javahidden.interview;

public class ArrayFinal {
    public static void main(String[] args) {
        final int arr[] = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]*10;
            System.out.println(arr[i]);
        }
    }
}
