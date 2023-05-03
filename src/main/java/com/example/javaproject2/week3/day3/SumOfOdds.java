package com.example.javaproject2.week3.day3;

public class SumOfOdds {
    public static void main(String[] args) {
        int oddSum = 0;
        for(int i = 1; i <= 10; i+=2){
           oddSum += i;
        }
        System.out.println(oddSum);
    }
}
