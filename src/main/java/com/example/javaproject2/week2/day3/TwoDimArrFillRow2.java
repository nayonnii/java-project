package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class TwoDimArrFillRow2 {

    public static void FillARow(int[][] arr, int RowNum) { // 행 번호를 넣으면 그 행의 값을 1로 변경
        arr[RowNum][0] = 1;
        arr[RowNum][1] = 1;
        arr[RowNum][2] = 1;
        arr[RowNum][3] = 1;
        arr[RowNum][4] = 1;
        printTwoDimArr(arr);
    }

    public static void printTwoDimArr(int[][]arr){ // 배열의 모든 요소 출력
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));
    }

    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        FillARow(arr, 1);
    }
}
