package com.example.javaproject2.week2.day4;

public class IncreaseOperator {
    public static void main(String[] args) {
        // ++가 뒤에 오는 경우, 나중에 1을 더해줌
        int i = 10;
        System.out.println(i++);
        System.out.println(i);

        // ++가 앞에 오는 경우, 먼저 1을 더해줌
        int i2 = 10;
        System.out.println(++i2);
        System.out.println(i2);
    }
}
