package io.dowlath.javahidden.datastructures.string;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindTheDuplicate {
    public static void main(String[] args) {
        String s = "Programming";
        solution(s);
    }
    private static void solution(String s){
        Map<Character,Integer> map = new HashMap<>();
        char[] c = s.toCharArray();
        for(Character ch : c){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();
        for(Map.Entry<Character,Integer> me : entrySet){
            if(me.getValue() > 1) {
                System.out.print(me.getKey() + ":::" + me.getValue());
            }
        }
    }
}
