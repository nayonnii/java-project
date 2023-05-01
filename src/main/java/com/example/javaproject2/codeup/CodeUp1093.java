package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numArr = new int[num];
        int[] studentArr = new int[23];

        for(int i = 0; i < numArr.length; i++){
            numArr[i] = sc.nextInt();
            studentArr[numArr[i] - 1]++;
        }
        for(int i = 0; i < studentArr.length; i++){
            System.out.printf("%d ", studentArr[i]);
        }
    }
}
