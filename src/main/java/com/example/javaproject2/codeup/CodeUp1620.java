package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        while(true){
            while(num > 0){
                sum += num % 10;
                num = num / 10;
            }
            if(sum >= 10){
                num = sum;
                sum = 0;
            } else{
                System.out.println(sum);
                break;
            }
        }
    }
}
