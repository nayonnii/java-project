package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hexaNum = sc.nextInt(16);
        for(int i = 1; i <= 15; i++){
            System.out.printf("%X*%X=%X\n", hexaNum, i, hexaNum * i);
        }
    }
}
