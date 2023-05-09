package com.example.javaproject2.week4.day2;

import java.util.Arrays;

public class SeperateIntoStaticMethod {
    public static void printArr(int[][] arr) {
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("----------------");
    }
    public static void main(String[] args) {

        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        printArr(arr);  // 아래 코드 printArr로 분리(리팩토링)
//        System.out.println(Arrays.toString(arr[0]));
//        System.out.println(Arrays.toString(arr[1]));
//        System.out.println(Arrays.toString(arr[2]));

        arr[0][0] = 0;
        arr[1][1] = 0;
        arr[2][2] = 0;

        printArr(arr);  // 아래 코드 printArr로 분리(리팩토링)
//        System.out.println(Arrays.toString(arr[0]));
//        System.out.println(Arrays.toString(arr[1]));
//        System.out.println(Arrays.toString(arr[2]));
    }
}
