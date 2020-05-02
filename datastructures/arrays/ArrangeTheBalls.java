package io.dowlath.javahidden.datastructures.arrays;

public class ArrangeTheBalls {
    public static void main(String[] args) {
        char[] balls = { 'R','B','B','G','R','G'};
        solution(balls);
        for( char c : balls){
            System.out.print(" "+ c);
        }
    }
    private static void solution(char[] c){
        int red = 0;
        int blue = c.length-1;
        if(red < blue){
            for(int i=0;i<=blue;i++){
                if('R' == c[i]){
                   char tmp = c[i];
                   c[i] = c[red];
                   c[red] = tmp;
                   red++;
                }
                else if ('B' == c[i]){
                    char tmp = c[i];
                    c[i] = c[blue];
                    c[blue] = tmp;
                    blue--;
                    i--;
                }
            }
        }
    }
}
