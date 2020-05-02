package io.dowlath.javahidden.datastructures.string;

import java.util.regex.Pattern;

public class GivenStringNumberOrNot {
    public static void main(String[] args) {
        String s = "Dowlath123BashaG";
        solution(s);
    }
    private static void solution(String s){
        Pattern p = Pattern.compile(".*\\D.*");
        System.out.println(p.matcher(s).matches());
    }
}
