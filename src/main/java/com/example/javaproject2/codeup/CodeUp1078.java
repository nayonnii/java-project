package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        int sum = 0;

//        풀이1
//        for(int i = 1; i <= iVal/2; i++){
//            sum += i*2;
//        }
//        System.out.println(sum);

//        풀이2
        for(int i = 0; i < iVal; i++) {
            if(i % 2 == 0){
              sum += i;
            }
        }
        System.out.println(sum);
    }
}
