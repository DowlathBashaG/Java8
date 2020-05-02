package io.dowlath.javahidden.datastructures.arrays;

public class TwoElementSum {
    public static void main(String[] args) {
        int[] a = {2,7,19,10};
        int target = 9;
        int[] index = solution(a,target);
        for(int i : index){
            System.out.print("  "+ i);
        }
    }
    private static int[] solution(int[] a,int target){
        int right = 0;
        int left = a.length-1;
        while( right <= left){
            int sum = a[right]+a[left];
            if(sum > target){
                 left--;
            }else if (sum < target){
                right++;
            }else{
                return new int[]{right+1,left+1};
            }
        }
        return new int[]{right+1,left+1};
    }
}
