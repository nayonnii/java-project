package com.example.javaproject2.week7.day1;

public class LeapYear {
    public static void main(String[] args) {
        int i = 1700;
//        if(checkLeapYear(i)) {
//            System.out.println(i + "년은 윤년입니다.");
//        } else {
//            System.out.println(i + "년은 윤년이 아닙니다.");
//        }
        if(isLeapYear(i)) {
            System.out.println(i + "년은 윤년입니다.");
        } else {
            System.out.println(i + "년은 윤년이 아닙니다.");
        }
    }

    public static boolean checkLeapYear(int year) {
        /* 윤년 알아맞추기
        * 4로 나누어 떨어지면 윤년, 단, 100년 단위론 윤년이 아님, 근데 400년 단위론 윤년임
        */
//        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//            return true;
//        } else {
//            return false;        }
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static boolean isLeapYear(int year) {
        if(year % 400 == 0) return true;
        if(year % 100 == 0) return false;
        if(year % 4 == 0) return true;
        return true;
    }
}
