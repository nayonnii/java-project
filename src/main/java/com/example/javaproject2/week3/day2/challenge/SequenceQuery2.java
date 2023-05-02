package com.example.javaproject2.week3.day2.challenge;

import java.util.Arrays;
class Solution2 {
    public int[] solution2(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        Arrays.fill(result, -1);

        for(int i = 0; i < queries.length; i++){
            int min = 1000;
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                if(queries[i][2] < arr[j] && min > arr[j]) {
                    min = arr[j];
                    result[i] = min;
                } else {
                    continue;
                }
            }
        }
        return result;
    }
}
public class SequenceQuery2 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {
                {0, 4, 2},
                {0, 3, 2},
                {0, 2, 2}
        };
        Solution2 s2 = new Solution2();
        System.out.println(Arrays.toString(s2.solution2(arr, queries)));
    }
}
