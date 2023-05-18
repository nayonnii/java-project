package com.example.javaproject2.week5.day1;

import java.util.Arrays;

public class BubbleSort02 {
    //가장 작은 숫자가 0번째에 오도록 정렬
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        int i = 0;
        for(int j = 1; j < arr.length; j++) {
            if(arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
