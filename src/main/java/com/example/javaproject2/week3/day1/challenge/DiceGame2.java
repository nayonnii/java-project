package com.example.javaproject2.week3.day1.challenge;

import java.util.Scanner;

class Solution {
    public int solution(int a, int b, int c){
        int result = 0;
        if(a == b && b == c) {
            result = (a + b + c) * (((int)Math.pow(a, 2) + (int)Math.pow(b, 2) + (int)Math.pow(c, 2)) * ((int)Math.pow(a, 3) + (int)Math.pow(b, 3) + (int)Math.pow(c, 3)));
        } else if((a == b && a != c) || (b == c && b != a) || (a == c && a != b)) {
            result = (a + b + c) * ((int)Math.pow(a, 2) + (int)Math.pow(b, 2) + (int)Math.pow(c, 2));
        } else if(a != b && b != c && a != c) {
            result = a + b+ c;
        }
        return result;
    }
}
public class DiceGame2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        int iVal3 = sc.nextInt();

        Solution s = new Solution();
        System.out.println(s.solution(iVal1, iVal2, iVal3));
    }
}
