package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1048 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int iVal1 = sc.nextInt();
            int iVal2 = sc.nextInt();
//        System.out.printf("%.0f", iVal1 * Math.pow(2, iVal2));
            System.out.printf("%d", iVal1 * 1<<iVal2);
    }
}
