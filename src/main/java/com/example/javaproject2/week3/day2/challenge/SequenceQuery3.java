package com.example.javaproject2.week3.day2.challenge;

import java.util.Arrays;
class Solution3 {
    public int[] solution3(int[] arr, int[][] queries) {
        int[] result = new int[arr.length];

        for(int i = 0; i < queries.length; i++) {
            int tmp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = tmp;
        }
        return arr;
    }
}
public class SequenceQuery3 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {
                {0, 3},
                {1, 2},
                {1, 4}
        };
        Solution3 s3 = new Solution3();
        System.out.println(Arrays.toString(s3.solution3(arr, queries)));
    }
}
