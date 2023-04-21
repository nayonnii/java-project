package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputNum = sc.nextLine().split("");

        int[] intInputNum = new int[inputNum.length];

        for(int i = 0; i < intInputNum.length; i++) {
            intInputNum[i] = Integer.parseInt(inputNum[i]) * (int) Math.pow(10, intInputNum.length - i - 1);
            System.out.println("[" + intInputNum[i] + "]");
        }
    }
}