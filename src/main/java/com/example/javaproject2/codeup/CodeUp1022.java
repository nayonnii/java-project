package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1022 {
    public static void main(String[] args) {
//문자열로 입력받을지 한 번 더 체크 필요
        Scanner sc = new Scanner(System.in);
        String[] inputNum = sc.nextLine().split("\\.");
        System.out.println(inputNum[0]);
        System.out.println(inputNum[1]);
    }
}