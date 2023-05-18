package com.example.javaproject2.week5.day1;

import java.util.Arrays;

public class BubbleSort02_OOP {
    //가장 작은 숫자가 min번째에 오도록 정렬

    public int[] sort(int[] arr, boolean isAsc) {
        if (isAsc) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort02_OOP bubbleSort02_oop = new BubbleSort02_OOP();
        int[] arr = {7, 2, 3, 9, 28, 11};
        System.out.println(Arrays.toString(bubbleSort02_oop.sort(arr, false)));
    }
}
