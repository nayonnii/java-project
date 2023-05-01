package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int b = sc.nextInt();
        float result = w * h * b / 8.0f / 1024 / 1024;
        System.out.printf("%.2f MB", result);
    }
}
