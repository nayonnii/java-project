package com.example.javaproject2.week2.day3;

public class CompoundAssignmentOperator {
    public static void main(String[] args) {
        int x= 10;
        x += 1;
        System.out.printf("+= %d\n", x);
        x -= 5;
        System.out.printf("-= %d\n", x);
        x *= 2;
        System.out.printf("*= %d\n", x);
        x /= 3;
        System.out.printf("/= %d\n", x);
        x %= 8;
        System.out.printf("%%= %d\n", x);
    }
}
