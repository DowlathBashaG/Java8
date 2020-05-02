package io.dowlath.javahidden.interview;

public class BinaryNum {
    public static void main(String[] args) {
        int n =2;

        String binary = Integer.toBinaryString(n);
        int maxConsecutiveOneNum = 0;
        int consecutiveOneNum = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                consecutiveOneNum++;
                maxConsecutiveOneNum = Math.max(maxConsecutiveOneNum, consecutiveOneNum);
            } else {
                consecutiveOneNum = 0;
            }
        }
        System.out.println(maxConsecutiveOneNum);


    }
}
