package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] num = sc.nextLine().split(" ");

        for (int i = 0; i < num.length; i++) {
            if (num[i].equals("0"))
                break;
            System.out.println(num[i]);
        }
    }
}
