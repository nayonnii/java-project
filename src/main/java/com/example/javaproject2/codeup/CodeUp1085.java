package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] inputVal = new long[4];
        for(int i = 0; i < inputVal.length; i++){
            inputVal[i] = sc.nextInt();
        }
        float result = (inputVal[0] * inputVal[1] * inputVal[2] * inputVal[3]) / 8.0f / 1024 / 1024;
        System.out.printf("%.1f MB", result);
    }
}
