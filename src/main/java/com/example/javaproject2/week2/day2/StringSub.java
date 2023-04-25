package com.example.javaproject2.week2.day2;

public class StringSub {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.substring(0, 1));    // H (1은 포함되지 않음)
        System.out.println(str.substring(0, 2));    // He
    }
}
