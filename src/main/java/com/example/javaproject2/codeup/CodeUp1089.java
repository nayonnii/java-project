package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNum = sc.nextInt();
        int diffNum = sc.nextInt();
        int count = sc.nextInt();

        int i = 1;
        while(i < count){
            startNum += diffNum;
            i++;
        }
//무한반복문 풀이
//        int i = 1;
//        while(true) {
//            startNum += diffNum;
//            i++;
//            if(i == count)
//                break;
//        }

        System.out.println(startNum);
    }
}
