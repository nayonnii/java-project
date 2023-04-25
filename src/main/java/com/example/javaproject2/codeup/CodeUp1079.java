package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sArr = sc.nextLine().split(" ");
        for(int i = 0; i < sArr.length; i++){
            System.out.println(sArr[i]);
            if(sArr[i].equals("q"))
                break;
        }
    }
}
