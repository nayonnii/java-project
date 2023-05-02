package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] checkerBoard = new int[19][19];
        for(int i = 0; i < checkerBoard.length; i++) {
            for(int j = 0; j < checkerBoard[i].length; j++){
                checkerBoard[i][j] = sc.nextInt();
            }
        }

        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j = 0; j < checkerBoard.length; j++) {
                    if(checkerBoard[x - 1][j] == 0) {
                        checkerBoard[x - 1][j] = 1;
                    } else {
                        checkerBoard[x - 1][j] = 0;
                    }

                    if(checkerBoard[j][y - 1] == 0) {
                        checkerBoard[j][y - 1] = 1;
                    } else {
                        checkerBoard[j][y - 1] = 0;
                    }
            }
        }

        for(int i = 0; i < checkerBoard.length; i++){
            for(int j = 0; j < checkerBoard[i].length; j++){
                System.out.printf("%d ", checkerBoard[i][j]);
            }
            System.out.println();
        }
    }
}
