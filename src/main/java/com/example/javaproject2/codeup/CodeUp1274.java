package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;
        int count = 0;

        for(int i = 2; i <= num; i++) {
            if(num % i == 0) {
                count++;
            }
        }
        System.out.println(count == 1 ? "prime" : "not prime");
    }
}
