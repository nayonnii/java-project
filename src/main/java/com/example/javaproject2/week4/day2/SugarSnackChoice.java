package com.example.javaproject2.week4.day2;

import java.util.Arrays;
import java.util.Scanner;
//codeup 1098 메소드로 분리
public class SugarSnackChoice {
    private int[][] arr;
    private boolean printSeperator;

    public SugarSnackChoice() {     // default 생성자
        this.arr = new int[5][5];
        this.printSeperator = true;
    }

    public SugarSnackChoice(boolean printSeperator) {   // 매개변수가 있는 생성자
        this.arr = new int[5][5];
        this.printSeperator = printSeperator;
    }

    public SugarSnackChoice(int rowCnt) {   // 매개변수가 있는 생성자
        this.arr = new int[rowCnt][5];
    }

    public SugarSnackChoice(int rowCnt, int colCnt) {   // 매개변수가 있는 생성자
        this.arr = new int[rowCnt][colCnt];
    }

    public void setBeam(int l, int d, int x, int y) {
        for(int i = 0; i < l; i++) {
            if(d == 0) {    // 가로
                arr[x - 1][y + i - 1] = 1;
            } else {    // 세로
                arr[x + i - 1][y - 1] = 1;
            }
        }
    }

    public void printArr() {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        if(this.printSeperator) System.out.println("------------------");
    }
    public static void main(String[] args) {
        SugarSnackChoice ssc = new SugarSnackChoice(true);

        ssc.setBeam(2, 0, 1, 1);
        ssc.printArr();

        ssc.setBeam(3, 1, 2, 3);
        ssc.printArr();

        ssc.setBeam(4, 1, 2, 5);
        ssc.printArr();
    }
}
