package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        System.out.printf("%d\n", iVal1+iVal2);
        System.out.printf("%d\n", iVal1-iVal2);
        System.out.printf("%d\n", iVal1*iVal2);
        System.out.printf("%d\n", iVal1/iVal2);
        System.out.printf("%d\n", iVal1%iVal2);
        System.out.printf("%.2f\n", (float)iVal1/iVal2);
//      System.out.printf("%.2f\n", iVal1/(iVal2*1.0));   // float 형변환 대신 1.0을 곱하는 방법도 있음
    }
}
