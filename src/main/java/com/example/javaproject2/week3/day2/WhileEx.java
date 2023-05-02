package com.example.javaproject2.week3.day2;

import java.time.LocalDateTime;

public class WhileEx {
    public static void main(String[] args) throws InterruptedException {
//        while문 예제1(무한반복)
//        int cnt = 0;
//        while(cnt < 11){
//            System.out.println(cnt);
//        }

//      while문 예제2
        int cnt2 = 0;
        while(cnt2 < 11){
            System.out.println(cnt2);
            cnt2++;
        }

//      while문 예제3(예제2 가독성 좋게 변경)
        int cnt3 = 0;
        while(cnt3 < 11){
            System.out.println(cnt3++);
        }
    }
}
