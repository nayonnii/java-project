package com.example.javaproject2.week3.day1.challenge;

import java.util.Arrays;

class Solution3 {
    public int[] solution3(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int q1 = queries[i][0];
            int q2 = queries[i][1];

            int tmp = arr[q1];
            arr[q1] = arr[q2];
            arr[q2] = tmp;
        }
        return arr;
    }
}

    public class SequenceQuery {
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