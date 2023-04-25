package com.example.javaproject2.week2.day2;

public class StringConcat {
    public static void main(String[] args) {
        String name = "이나연";
        int balance = 10000;
        String massage = name + "님의 통장 잔고는 " + balance + "원입니다.";
        System.out.println(massage);

        String result = String.format("%s님의 통장 잔고는 %d원입니다.", name, balance);    //String.format() => printf의 기능
        System.out.println(massage);
    }
}
