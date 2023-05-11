package com.example.javaproject2.week4.day1.challenge;

import java.util.Scanner;

public class RockScissorPaper {
    public static void main(String[] args) {
        //바위: 0 /가위: 1 /보: 2
        Scanner sc = new Scanner(System.in);
        String user;    // String타입으로 입력받은 user값
        int com = 0;    // int타입 com값
        String newCom = ""; // String타입으로 변환한 com값

        int result = 0;

        do {
            System.out.printf("가위, 바위, 보 중 하나를 입력하세요. > ");
            user = sc.nextLine();
            com = (int)(Math.random() * 3);

            switch(com) {
                case 0:
                    newCom = "바위"; break;
                case 1:
                    newCom = "가위"; break;
                case 2:
                    newCom = "보"; break;
            }

            if((user.equals("바위") && newCom.equals("가위")) || (user.equals("가위") && newCom.equals("보")) || (user.equals("보") && newCom.equals("바위"))) {
                result = 1;
            } else if(user.equals(newCom)) {
                result = 0;
            } else {
                result = -1;
            }
        }while(result != 1);

        System.out.printf("user: %s, com: %s으로 당신이 이겼습니다.", user, newCom);
    }
}
