package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char inputCh = sc.nextLine().charAt(0);
        char startCh = 'a';

        for(int i = 0; i <= inputCh - 'a'; i++){
            System.out.print(startCh + " ");
            startCh++;
        }
    }
}
