package com.example.javaproject2.week3.day3;

import static java.lang.Math.sqrt;

public class IsPrime4 {
    public static void main(String[] args) {
        int num = 17;
        int factors = 0;
        //루트 i까지만 검색하여 소수 판별
        for(int i = 2; i <= (int)sqrt(num); i++){
            if(num % i == 0){
                factors++;
            }
        }
        System.out.println("factors: " + factors);
        System.out.println(factors == 0);
    }
}
