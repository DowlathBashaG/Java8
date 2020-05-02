package io.dowlath.javahidden.datastructures.string;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Dowlath Basha G";
        solution(s);

    }
    private static void solution(String s){
        if(s.isEmpty()){
            System.out.println(s);
        }else {
            System.out.print(s.charAt(s.length() - 1));
            solution(s.substring(0, s.length() - 1));
        }

    }
}
