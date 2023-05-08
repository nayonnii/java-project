package com.example.javaproject2.week4;

import java.util.Scanner;

public class DiamondStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {  // 1 2 3
            for(int j = num - i; j > 0; j--) {   // 2 1 0
                System.out.print(" ");
            }
            for(int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = num - 1; i >= 1; i--) {  // 2 1
            for(int j = 1; j <= num - i; j++) {   // 1 2
                System.out.print(" ");
            }
            for(int k = 2 * i - 1; k >= 1; k--) {    // 3 1
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
