package com.example.javaproject2.week3.day1;

public class MultiplicationTableMethod {
    //특정 단만 출력하기(메서드 사용)
    public static void printDan(int dan){
        System.out.println(dan + "단");
        for(int i = 1; i <= 9; i++){
            System.out.printf("%d * %d = %d\n", dan, i, dan * i);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printDan(2);
        printDan(5);
        printDan(6);
    }
}
