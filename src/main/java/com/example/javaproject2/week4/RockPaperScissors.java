package com.example.javaproject2.week4;

import java.util.Scanner;

public class RockPaperScissors {
    public String play(int user, int com) {
        //바위: 0 /가위: 1 /보: 2
        if((user == 0 && com == 1) || (user == 1 && com == 2) || (user == 2 && com == 0)) {
            return "win";
        } else if(user == com) {
            return "tie";
        } else {
            return "lose";
        }
    }
    public static void main(String[] args) {
        //바위: 0 /가위: 1 /보: 2
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int com = sc.nextInt();

        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        System.out.println(rockPaperScissors.play(user, com));
    }
}
