package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1671 {
    public static void main(String[] args) {
        //바위: 0 /가위: 1 /보: 2
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int com = sc.nextInt();

        if((user == 0 && com == 1) || (user == 1 && com == 2) || (user == 2 && com == 0)) {
            System.out.println("win");
        } else if(user == com) {
            System.out.println("tie");
        } else {
            System.out.println("lose");
        }
    }
}
