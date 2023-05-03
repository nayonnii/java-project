package com.example.javaproject2.week3.day3;

public class IsPrime3 {
    public static void main(String[] args) {
        int num = 25;
        int factors = 0;
        // i / 2까지만 검색하여 소수 판별
        for(int i = 2; i <= num / 2; i++){
            if(num % i == 0){
                factors++;
            }
        }
        System.out.println("factors: " + factors);
        System.out.println(factors == 0);
    }
}
