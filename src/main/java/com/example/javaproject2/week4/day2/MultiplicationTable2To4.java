package com.example.javaproject2.week4.day2;

public class MultiplicationTable2To4 {
    public static void main(String[] args) {
        for(int i = 2; i <= 4; i++) {
            for(int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println("------------------------");
        }
    }
}
