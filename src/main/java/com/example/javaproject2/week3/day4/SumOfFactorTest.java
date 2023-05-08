package com.example.javaproject2.week3.day4;

import java.util.Scanner;

public class SumOfFactorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        SumOfFactor sumOfFactor = new SumOfFactor();
        System.out.printf("%d의 약수는 ", num);
        sumOfFactor.printFactorResult(num);
        System.out.printf("입니다.\n");

        System.out.printf("%d의 약수의 합은 %d입니다.", num, sumOfFactor.SumOfFactors(num));
    }
}
