package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Byte bVal1 = sc.nextByte();
        Byte bVal2 = sc.nextByte();

        System.out.printf("%d", bVal1 == 1 && bVal2 == 1 ? 1 : 0);
    }
}
