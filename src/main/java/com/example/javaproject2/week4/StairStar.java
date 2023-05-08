package com.example.javaproject2.week4;

public class StairStar {
    public static void main(String[] args) {
        int height = 5;

        for(int i = 0; i < height; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("**");
        }
    }
}
