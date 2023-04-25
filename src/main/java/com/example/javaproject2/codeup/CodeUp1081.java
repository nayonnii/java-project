package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int space1 = sc.nextInt();
       int space2 = sc.nextInt();

       for(int i = 1; i <= space1; i++){
           for(int j = 1; j <= space2; j++){
               System.out.println(i + " " + j);
           }
       }
    }
}
