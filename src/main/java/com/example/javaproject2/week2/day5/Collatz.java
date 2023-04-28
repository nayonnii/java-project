package com.example.javaproject2.week2.day5;

import java.util.Scanner;

class Solution {
     public int solution(long num){
         int answer = 0;

         while(true) {
             if(num % 2 == 0) {
                 num /= 2;
             } else {
                 num *= 3 + 1;
             }
             answer++;

             if(num == 1) {
                 break;
             } else if (answer > 500) {
                 return -1;
             }
         }
         return answer;
     }
}

public class Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Solution s = new Solution();
        System.out.println(s.solution(sc.nextLong()));
    }
}
