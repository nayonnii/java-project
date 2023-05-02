package com.example.javaproject2.week3.day2;

public class DigitNumber {
    public static void main(String[] args) {
        int num = 45634;
        // 자릿수만큼 반복

        int digits = 0;
        while(num > 0) {
            num = num / 10;
            digits++;
        }
        System.out.println(digits);
    }
}
