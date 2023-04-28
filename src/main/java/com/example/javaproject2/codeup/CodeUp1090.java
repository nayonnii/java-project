package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long startNum = sc.nextInt();
        int mulNum = sc.nextInt();
        int sumNum = sc.nextInt();
        int count = sc.nextInt();

        int i = 1;
        while(i < count){
            startNum = startNum * mulNum + sumNum;
            i++;
        }
        System.out.println(startNum);
    }
}
