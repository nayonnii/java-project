package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int maxNum = sc.nextInt();
        int sum = 0;

//        풀이1
//        for(num = 1; sum < maxNum; num++){
//            sum += num;
//        }
//        System.out.println(num-1);

//        풀이2
        for(num = 1; num < maxNum; num++){
            sum += num;
            if(sum >= maxNum)
                break;
        }
        System.out.println(num);
    }
}
