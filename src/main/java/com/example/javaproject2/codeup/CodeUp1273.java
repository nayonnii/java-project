package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factor = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.printf("%d ", i);
            }
        }
    }
}
