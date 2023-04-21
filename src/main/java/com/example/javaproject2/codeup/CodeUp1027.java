package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] date = sc.nextLine().split("\\.");

        System.out.printf("%02d-%02d-%04d", Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0]));
    }
}