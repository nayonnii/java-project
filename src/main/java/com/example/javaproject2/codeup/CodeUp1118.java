package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   // 밑변
        int b = sc.nextInt();   // 높이

        System.out.printf("%.1f", (float)a * b / 2);
    }
}
