package com.example.javaproject2.week4;

import java.util.Scanner;

public class PyramidStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for(int i = 1; i <= num; i++) {
            for(int k = 1; k <= num - i; k++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
