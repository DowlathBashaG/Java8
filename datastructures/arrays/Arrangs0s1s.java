package io.dowlath.javahidden.datastructures.arrays;

import java.util.Arrays;

public class Arrangs0s1s {
    public static void main(String[] args) {
        int[] a = { 1,1,0,0,1,0,1,0};
        solution(a);
        for( int i : a){
            System.out.print(" "+i);
        }
    }
    private static void solution(int[] a){
        int right = 0;
        int left = a.length-1;
        if( right < left){
            for(int i=0;i<=left;i++){
                if(a[i] == 0){
                    int tmp = a[i];
                    a[i] = a[right];
                    a[right] = tmp;
                    right++;
                } else if (a[i] == 1){
                    int tmp = a[i];
                    a[i] = a[left];
                    a[left] = tmp;
                    left--;
                    i--;
                }
            }
        }

    }
}
