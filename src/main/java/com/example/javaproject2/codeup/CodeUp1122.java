package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int second = sc.nextInt();

        System.out.printf("%d %d", second/60, second%60);
    }
}
