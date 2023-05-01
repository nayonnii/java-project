package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int sum = 0;
        int num = 1;

        while(true) {
            sum += num;
            num++;
            if(sum >= inputNum) {
                break;
            }
        }
        System.out.println(sum);
    }
}
