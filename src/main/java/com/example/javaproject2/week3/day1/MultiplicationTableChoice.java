package com.example.javaproject2.week3.day1;

public class MultiplicationTableChoice {
    public static void main(String[] args) {
        // 특정 단만 출력하기
        int[] dan = {2, 5, 6};

        for(int i = 0; i < dan.length; i++){
            System.out.println(dan[i] + "단");
            for(int j = 1; j <= 9; j++){
                System.out.printf("%d * %d = %d\n", dan[i], j, dan[i] * j);
            }
        }

    }
}
