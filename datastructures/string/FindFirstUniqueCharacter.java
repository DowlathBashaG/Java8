package io.dowlath.javahidden.datastructures.string;

import java.util.HashMap;
import java.util.Map;

public class FindFirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "ddoowwllaatth";
        solution(s);
    }
    private static void solution(String s){
        Map<Character,Integer> uniqueMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!uniqueMap.containsKey(c)){
                uniqueMap.put(c,i);
            }else{
                uniqueMap.put(c,-1);
            }
        }
        int min = Integer.MAX_VALUE;
        char uniqueCharacter = ' ';
        for(char ch : uniqueMap.keySet()){
            if(uniqueMap.get(ch) > -1 && uniqueMap.get(ch) < min){
                min = uniqueMap.get(ch);
                uniqueCharacter = ch;
            }
        }
        System.out.println(uniqueCharacter+ "    "+(min>Integer.MAX_VALUE?-1:min));
    }
}
