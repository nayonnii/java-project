package com.example.javaproject2.week2.day4;

public class Accumulate687 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;     // 누적할 변수 선언
        answer = answer + num % 10; // 나머지를 먼저 구하고
        System.out.printf("answer: %d\n", answer);
        num = num / 10; // 몫을 구해야 함
        answer = answer + num % 10;
        System.out.printf("answer: %d\n", answer);
        num = num / 10;
        answer = answer + num % 10;
        System.out.printf("answer: %d\n", answer);

//        while문 사용 풀이
//        while(num > 0) {
//            answer = answer + (num % 10);
//            num = num / 10;
//        }
//        System.out.printf("answer: %d\n", answer);
    }
}
