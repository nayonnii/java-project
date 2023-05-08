package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1367 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) { // 1 2 3 4
            for (int j = num - i; j >= 1; j--) { // 3 2 1
                System.out.print(" ");
            }
            for (int k = 1; k <= num; k++) {
                System.out.print("*");
            }
            System.out.println(

            );
        }
    }
}
