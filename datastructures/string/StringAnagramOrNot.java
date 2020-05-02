package io.dowlath.javahidden.datastructures.string;

import java.util.Arrays;

public class StringAnagramOrNot {
    public static void main(String[] args) {
        String s1 = "Keep";
        String s2 = "Peek";
        solution(s1,s2);
    }
    private static void solution(String s1,String s2){
        boolean status =  true;
        if(s1 == null || s2 == null){
            status = false;
        }
        if(s1.length() != s2.length()){
            status = false;
        }
        String s1Copy = s1.replaceAll("\\s","");
        String s2Copy = s2.replaceAll("\\s","");

        char[] charS1 = s1Copy.toLowerCase().toCharArray();
        char[] charS2 = s2Copy.toLowerCase().toCharArray();

        Arrays.sort(charS1);
        Arrays.sort(charS2);

        status = Arrays.equals(charS1,charS2);

        if(status){
            System.out.println("Given String is Anagram");
        }else{
            System.out.println("Given String is not Anagram");
        }



    }
}
