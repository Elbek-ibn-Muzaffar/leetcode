package com.juniper;
//https://leetcode.com/problems/matchsticks-to-square/
import java.util.Arrays;

class Matchsticks {
    public static boolean makesquare(int[] matchsticks) {
        Arrays.sort(matchsticks);
        int max = matchsticks[matchsticks.length - 1];
        int next = 0;
        int temp = next + 1;
        int s = matchsticks[next];
        int cnt = 0;

        while (next<matchsticks.length-1){
            for (int i = temp; i <= matchsticks.length - 2 ; i++) {
                s = s+matchsticks[i];
                if (s == max) {
                    cnt++;
                    temp = i;
                    break;
                }else if (s>max)
                    break;
            }
            s = 0;
            next = temp + 1;
            temp = next + 1;

        }
        return true;
    }

    public static void main(String[] args) {
        int[] mat = {1,1,1,1,1,1,2,2,5,5};
        System.out.println(makesquare(mat));
    }
}