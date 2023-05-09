package com.example.javaproject2.week4.day2;

public class MultiplicationTableMethod {
    public static void printMultiplicationTable(int dan) {
        System.out.println("[" + dan + "단]");
        for(int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", dan, j, dan * j);
            }
            System.out.println("------------------------");
    }
    public static void main(String[] args) {
        printMultiplicationTable(2);
        printMultiplicationTable(5);
        printMultiplicationTable(11);
    }
}
