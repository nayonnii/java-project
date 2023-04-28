package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //문제에 정수 a,b라고 명시되어 있어 동일하게 변수명 지정함
        int a = sc.nextInt();   // a=피제수
        int b = sc.nextInt();   // b=제수

        System.out.println(a % b);
    }
}
