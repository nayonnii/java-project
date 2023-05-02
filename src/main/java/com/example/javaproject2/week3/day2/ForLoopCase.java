package com.example.javaproject2.week3.day2;

public class ForLoopCase {
    public static void main(String[] args) {
        // 조건식 case1(무한루프)
        // 1 == 1 자리에는 boolean값만 나오면 됨(true도 가능), 생략도 가능
//        for(int i = 0; 1 == 1; i++) {
//            System.out.println(i);
//        }

        // 조건식 case2
        for(int j = 0; 2 * j <= 18; j++){
            System.out.println(j);
        }

        // 조건식 case3
        //Math.sqrt() 대신 i * i <= 50으로 처리도 가능
        for(int k = 0; k <= Math.sqrt(50); k++) {
            System.out.println(k);
        }
    }
}
