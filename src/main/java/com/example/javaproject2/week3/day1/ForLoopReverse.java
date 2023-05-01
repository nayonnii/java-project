package com.example.javaproject2.week3.day1;

public class ForLoopReverse {
    public static void main(String[] args) {
        for(int i = 10; i >= 0; i--){       // 0포함여부) 미포함 : i > 0, 포함 : i >= 0
//            System.out.println(i);        // 세로 출력
            System.out.printf("%d ", i);    // 가로 출력
        }
//        잘못된 풀이) 무한반복 CASE
//        for(int i = 10; i >= 0; i++){       // 증감식 i--로 변경 필요
//            System.out.println(i);
//        }
    }
}
