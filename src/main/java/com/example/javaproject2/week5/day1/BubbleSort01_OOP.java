package com.example.javaproject2.week5.day1;

import java.util.Arrays;

public class BubbleSort01_OOP {
    public int[] sortAround(int[] arr, int until) {
        for(int i = 0; i < until; i++) {
            if(arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr;
    }

    public int[] sort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            BubbleSort01_OOP bubbleSort01_oop = new BubbleSort01_OOP();
            arr = sortAround(arr, arr.length - i);  // 클래스 안에서 호출하는 것이기 때문에 메소드 이름만으로도 호출 가능
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort01_OOP bubbleSort01_oop = new BubbleSort01_OOP();
        int arr[] = {7, 2, 3, 9, 28, 1};
        System.out.println(Arrays.toString(bubbleSort01_oop.sort(arr)));

    }
}
