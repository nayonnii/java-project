package com.example.javaproject2.week1;

public class PrintfDate {
    public static void main(String[] args) {
        System.out.printf("%d\n", 4);
        System.out.printf("%02d\n", 4);     //04 출력
        System.out.printf("%02d\n", 11);    //두 자리일 땐 0을 붙이지 않고 11로 출력
        System.out.printf("%d-%02d-%02d", 2023, 4, 20);
    }
}
