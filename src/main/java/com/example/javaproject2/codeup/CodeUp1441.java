package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];

        // 정렬할 배열요소(숫자) 입력
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // 버블 정렬
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // 모든 배열 요소 출력
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
