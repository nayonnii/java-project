package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int[] studentArr = new int[inputNum];

        for(int i = 0; i < studentArr.length; i++){
            studentArr[i] = sc.nextInt();
        }

        int min = studentArr[0];

        for(int i = 0; i < studentArr.length; i++){
            if(min > studentArr[i]){
                min = studentArr[i];
            }
        }
        System.out.println(min);
    }
}
