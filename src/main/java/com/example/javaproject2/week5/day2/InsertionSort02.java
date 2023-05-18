package com.example.javaproject2.week5.day2;

import java.util.Arrays;

public class InsertionSort02 {
//    desc --> 내림차순
//    asc --> 오름차순
    public int[] sort(int[] arr, boolean isAscending) {
        for(int i = 1; i < arr.length; i++) {
            for(int j = i; j > 0; j--) {
                System.out.printf("i: %d j: %d j-1: %d\n", i, j, j - 1);

                // isAscending이 true이면 오름차순, false이면 내림차순 정렬
                if((isAscending ? arr[j - 1] - arr[j] : arr[j] - arr[j - 1]) > 0 ) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }
    public int[] sort(int[] arr) {
       return sort(arr, true);
    }
    public static void main(String[] args) {
        InsertionSort02 insertionSort02Asc = new InsertionSort02();
        InsertionSort02 insertionSort02Desc = new InsertionSort02();

        int[] arr = {7, 2, 3, 9, 28, 11};
//        int[] arrAsc = insertionSort02Asc.sort(arr);  // true는 생략 가능
        int[] arrDesc = insertionSort02Desc.sort(arr, false);
//        System.out.println(Arrays.toString(arrAsc));
        System.out.println(Arrays.toString(arrDesc));
    }
}
