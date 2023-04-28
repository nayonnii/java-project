package com.example.javaproject2.week2.day5;

import java.util.Scanner;

public class PrintSquareStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //직사각형 가로 길이
        int m = sc.nextInt();    //직사각형 세로 길이

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
