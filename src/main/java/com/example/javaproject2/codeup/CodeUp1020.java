package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//풀이1 - split() 활용
//        String[] pnum = sc.nextLine().split("-"); // pnum: personalnum(주민등록번호)
//        System.out.println(pnum[0]+pnum[1]);

//풀이2 - subStirng() 활용
        String pnum = sc.nextLine();
        System.out.print(pnum.substring(0,6) + pnum.substring(7,13));
    }
}