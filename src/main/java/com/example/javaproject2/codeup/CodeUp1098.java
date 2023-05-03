package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hVal = sc.nextInt();    //격자판의 세로 길이
        int wVal = sc.nextInt();    //격자판의 가로 길이
        int nVal = sc.nextInt();    //막대의 개수
        int[][] board = new int[hVal][wVal];

        for(int i = 0; i < nVal; i++){
            int lVal = sc.nextInt();    //막대의 길이
            int dVal = sc.nextInt();    //막대의 방향
            int xVal = sc.nextInt();    //막대 시작점의 x좌표
            int yVal = sc.nextInt();    //막대 시작점의 y좌표

            for(int j = 0; j < lVal; j++){
                if(dVal == 0){
                    board[xVal - 1][yVal + j - 1] = 1;
                }else{
                    board[xVal + j - 1][yVal - 1] = 1;
                }
            }
        }

        for(int i = 0; i < board.length; i++){
           for(int j = 0; j < board[i].length; j++) {
               System.out.printf("%d ", board[i][j]);
           }
            System.out.println();
        }
    }
}
