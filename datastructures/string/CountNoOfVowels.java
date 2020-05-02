package io.dowlath.javahidden.datastructures.string;

public class CountNoOfVowels {
    public static void main(String[] args) {
        String s = "This is java program";
        solution(s);
    }
    private static void solution(String s) {
        int count = 0;
        char[] c = s.toCharArray();
        for (char ch : c){
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                default:
            }
        }
        System.out.println(count);

    }
}
