package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] hmin = sc.nextLine().split("[.]"); //split() 사용 시 .으로 분리해야 할 경우, [.] 혹은 \\. 사용 필요
        int year = Integer.parseInt(hmin[0]);
        int month = Integer.parseInt(hmin[1]);
        int day = Integer.parseInt(hmin[2]);
//        System.out.println(Arrays.toString(hmin));
        System.out.printf("%04d.%02d.%02d", year, month, day);
    }
}