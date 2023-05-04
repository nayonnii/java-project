package com.example.javaproject2.week3.day4;

public class GetMaxMinArr {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2},
                {31, 9}
        };

        int maxValue = arr[0][0];
        int minValue = arr[0][0];

        // 최대값 구하기
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(maxValue < arr[i][j]){
                    maxValue = arr[i][j];
                }
            }
        }

        // 최소값 구하기
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(minValue > arr[i][j]){
                    minValue = arr[i][j];
                }
            }
        }
        System.out.printf("최대값: %d\n", maxValue);
        System.out.printf("최소값: %d\n", minValue);
    }
}
