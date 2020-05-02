package io.dowlath.javahidden.datastructures.string;

public class CompressedString {
    public static void main(String[] args) {
        String s = "aaabbbccc";
        solution(s);
    }
    private static void solution(String s){
        String s1 = "";
        String s2 = "";
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s1.indexOf(s.charAt(i)) < 0){
                s1 = s1+s.charAt(i);
            }
        }

        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s.length();j++){
                if(s1.charAt(i) == s.charAt(j)){
                    count++;
                }
            }
            s2 = s2+s1.charAt(i)+count;
            count = 0;
        }
        System.out.println(s2);
    }
}
