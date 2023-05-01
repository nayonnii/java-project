package com.example.javaproject2.week3.day1;

public class NewSwitchCaseDaysOfMonth {
    public static void main(String[] args) {
        int month = 11;
        int lastDate = switch(month) {  // switch의 타입은 lastDate의 타입인 int여야 함
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> throw new IllegalArgumentException("해당월은 없습니다. 입력월 : " + month);
        };
        System.out.printf("%d월 %d일까지 있습니다.\n", month, lastDate);
    }
}
