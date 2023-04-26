package com.example.javaproject2.week2.day3;

public class RemainderSum {
    public static void main(String[] args) {
        int num = 687;
        int firstRemainder = num % 10;
        num = num / 10;
        int twoRemainder = num % 10;
        num = num / 10;
        int threeRemainder = num % 10;

        System.out.println(firstRemainder + twoRemainder + threeRemainder);

        //반복문 활용해보기
        int num2 = 687;
        int remainderSum = 0;

        while(true){
            remainderSum += num2 % 10;
            num2 /= 10;

            if(num2 % 10 == 0)
                break;
        }
        System.out.println(remainderSum);
    }
}
