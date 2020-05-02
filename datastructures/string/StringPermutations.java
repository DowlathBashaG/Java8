package io.dowlath.javahidden.datastructures.string;

public class StringPermutations {
    public static void main(String[] args) {
        String s = "abc";
        solution(" ",s);
    }
    private static void solution(String perm , String word){
        if(word.isEmpty()){
            System.out.println(perm+word);
        }else{
            for(int i=0;i<word.length();i++){
                solution(perm+word.charAt(i),word.substring(0,i)+word.substring(i+1,word.length()));
            }
        }
    }
}

