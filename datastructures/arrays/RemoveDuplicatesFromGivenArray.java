package io.dowlath.javahidden.datastructures.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromGivenArray {
    public static void main(String[] args) {
        int[] a = {1,2,78,3,1,2,3};
        solution(a);
    }
    private static void solution(int[] a){
        int length = a.length;
        for(int i = 0;i<length;i++){
            for(int j= i+1;j<length;j++){
                if(a[i] == a[j]){
                    a[j] = a[length-1];
                    length--;
                    j--;
                }
            }
        }
        System.out.println("Given array ... :"+ Arrays.toString(a));
        int[] withOutDuplicates = Arrays.copyOf(a,length);
        System.out.println("After removed duplicates ..." + Arrays.toString(withOutDuplicates));
    }
}
