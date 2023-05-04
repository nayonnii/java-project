package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] maze = new int[10][10];
        int startX = 1;
        int startY = 1;

        // 미로 입력받기
        for(int i = 0; i < maze.length; i++){
            for(int j = 0; j < maze[i].length; j++){
                maze[i][j] = sc.nextInt();
            }
        }

        // 길찾기 시작
        while(true){
            if(maze[startY][startX] == 2){  //시작점에 먹이가 있을 경우
                maze[startY][startX] = 9;
                break;
            }else{                          //시작점에 먹이가 없을 경우
                maze[startY][startX] = 9;
                if(maze[startY][startX + 1] == 1){             // 1. 오른쪽에 벽 발견
                    if(maze[startY + 1][startX] == 1){         // 2. 아래쪽에 벽 발견
                        break;
                    }else if(maze[startY + 1][startX] == 2){   // 2-1. 아래쪽에 먹이 발견
                        maze[startY + 1][startX] = 9;
                        break;
                    }else{                                     // 2-2. 아래쪽에 길 있음
                        startY = startY + 1;
                    }
                }else if(maze[startY][startX + 1] == 2){       // 1-1. 오른쪽에 먹이 발견
                    maze[startY][startX + 1] = 9;
                    break;
                }else{                                         // 1-2. 오른쪽에 길 있음
                    startX = startX + 1;
                }
            }
        }

        // 길찾기 완료한 배열 출력
        for(int i = 0; i < maze.length; i++){
            for(int j = 0; j < maze[i].length; j++){
                System.out.printf("%d ", maze[i][j]);
            }
            System.out.println();
        }
    }
}