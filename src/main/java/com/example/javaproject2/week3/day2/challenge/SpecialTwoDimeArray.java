package com.example.javaproject2.week3.day2.challenge;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[][] solution(int n) {
        int[][] arr = new int[n][n];
        for(int i = 0; i < arr.length; i++){
            arr[i][i] = 1;
        }
        return arr;
    }
}
public class SpecialTwoDimeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Solution s = new Solution();
        for(int i = 0; i < s.solution(n).length; i++) {
            System.out.printf(Arrays.toString(s.solution(n)[i]));
        }
    }
}
