package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int result = 0;

        while(true){
            result += num1;

            if(result % num2 == 0 && result % num3 == 0)
                break;
        }
        System.out.println(result);
    }
}
