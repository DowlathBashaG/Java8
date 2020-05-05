package io.dowlath.alno;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1 = " apple";
        String s2 = " pear";
        String s3 = commonSubSequence(s1,s2);
        System.out.println("Longest Common Subsequence ... : "+ s3);
    }
    public static String commonSubSequence(String s1,String s2){
        String s3 = new String(s1.substring(0,4)+(s2.substring(1,4)));
        return s3;
    }
}
