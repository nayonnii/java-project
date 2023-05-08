package com.example.javaproject2.week3.day4;

public class SumOfFactor {
    public int SumOfFactors(int num) {
        int result = 0;

        for(int i = 1; i <= num; i++) {
            if(num % i == 0) result += i;
        }
        return result;
    }

    void printFactorResult(int num) {
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) System.out.printf("%d ", i);
        }
    }
}
