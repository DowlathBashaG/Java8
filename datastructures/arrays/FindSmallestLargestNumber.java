package io.dowlath.javahidden.datastructures.arrays;

public class FindSmallestLargestNumber {
    public static void main(String[] args) {
        int[] a = {1,54,23,0};
        solution(a);
    }
    private static void solution(int[] a){
        int smallest = a[0];
        int largest = a[0];
        for(int i = 0;i<a.length;i++){
            if(a[i] < smallest) {
                smallest = a[i];
            }
            else if(a[i] > largest){
                largest = a[i];
            }
        }
        System.out.println("Largest ... : "+ largest+"    "+ "Smallest .... :"+smallest);
    }
}
