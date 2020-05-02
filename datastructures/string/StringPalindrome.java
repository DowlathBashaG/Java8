package io.dowlath.javahidden.datastructures.string;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "madam";
        solution(s);
    }
    private static void solution(String s){
        String text = reverse(s);
        if(text.equals(s)){
            System.out.println("Is palindrome");
        }
        else{
            System.out.println("Is not palindrome");
        }
    }

    private static String reverse(String s){
        if(s == null || s.isEmpty()){
            return s;
        }
        return s.charAt(s.length()-1)+reverse(s.substring(0,s.length()-1));
    }
}
