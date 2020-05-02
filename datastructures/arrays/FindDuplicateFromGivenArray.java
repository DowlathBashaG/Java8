package io.dowlath.javahidden.datastructures.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateFromGivenArray {
    public static void main(String[] args) {
        int[] a = {1,2,1,2,3};
        Set<Integer> duplicates = solution(a);
        System.out.println(duplicates);

    }
    private static Set<Integer> solution(int[] a){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<a.length;i++){
            for( int j = i+1;j<a.length;j++){
                if(a[i] == a[j] && i != j ){
                    hashSet.add(a[i]);
                    break;
                }
            }
        }
        return hashSet;
    }
}

