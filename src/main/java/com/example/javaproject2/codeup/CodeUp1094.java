package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int[] studentArr = new int[inputNum];

        for(int i = 0; i < studentArr.length; i++){
            studentArr[i] = sc.nextInt();
        }

        for(int i = studentArr.length - 1; i >= 0; i--){
            System.out.printf("%d ", studentArr[i]);
        }
    }
}
