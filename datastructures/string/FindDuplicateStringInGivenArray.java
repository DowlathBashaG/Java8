package io.dowlath.javahidden.datastructures.string;

public class FindDuplicateStringInGivenArray {
    public static void main(String[] args) {
        String[] s= {"I","Dowlath","I","Basha","Dowlath"};
        solution(s);
    }
    private static void solution(String[] s){
        for(int i=0;i<s.length;i++){
            for(int j = i+1;j<s.length;j++){
                if(s[i] == s[j] && (i != j)){
                    System.out.println(" "+s[i]);
                    break;
                }
            }
        }
    }

}
