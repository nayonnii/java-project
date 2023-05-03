package com.example.javaproject2.week3.day3;

public class IsPrimeBreak {
    public static void main(String[] args) {
        int num = 992;
        int factors = 0;
        for(int i = 2; i < num; i++){
            if(num % i == 0){   // 나누어 떨어지는지 확인
                factors += 1;
                break;  // 나누어 떨어지면 멈춤
            }
        }
        if(factors == 0){
            System.out.printf("%d는 소수입니다.", num);
        } else {
            System.out.printf("%d는 소수가 아닙니다.", num);
        }
    }
}
