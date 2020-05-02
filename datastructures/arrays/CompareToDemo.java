package io.dowlath.javahidden.datastructures.arrays;

public class CompareToDemo {
    public static void main(String[] args){
        String s1 = "j2ee";
        String s2 = "j2me";
        System.out.println(s1.compareTo(s2));
        System.out.println(compare(s1,s2));
    }

    public static int compare(String s1,String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int min = Math.min(l1, l2);
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for (int i = 0; i < min; i++) {
             char ch1 = c1[i];
             char ch2 = c2[i];
              if(ch1 !=  ch2){
                  return ch1-ch2;
            }
        }
        return l1-l2;
    }

}
