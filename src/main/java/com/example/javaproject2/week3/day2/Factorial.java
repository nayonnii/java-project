package com.example.javaproject2.week3.day2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 1; // 0으로 하면 안됨

        for(int i = n; i > 0; i--) {
            System.out.println(i);
            answer *= i;
        }
        System.out.println(answer);
    }
}
