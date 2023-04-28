package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1124 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] formula = sc.nextLine().split("C");
        String[] xyNum = formula[1].split("H");

        int xNum = Integer.parseInt(xyNum[0]);
        int yNum = Integer.parseInt(xyNum[1]);
        int mole = 12 * xNum + 1 * yNum;

        System.out.println(mole);
    }
}
