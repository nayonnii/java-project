package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class TwoDimArrSetValue {
    //메소드로 리팩토링
    public static void printArray(int[][] arr){ //2차원 배열을 파라미터값으로 받으면 아래 코드를 출력해줌
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        printArray(arr);    //printArray 메소드로 리팩토링
//        System.out.println(Arrays.toString(arr[0]));
//        System.out.println(Arrays.toString(arr[1]));
//        System.out.println(Arrays.toString(arr[2]));

        arr[0][0] = 1;
        arr[1][0] = 2;
        arr[0][2] = 3;

        printArray(arr);    //printArray 메소드로 리팩토링
//        System.out.println(Arrays.toString(arr[0]));
//        System.out.println(Arrays.toString(arr[1]));
//        System.out.println(Arrays.toString(arr[2]));
    }

}
