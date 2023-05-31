package com.example.javaproject2.week7.day1;

public class LeapYear {
    public static void main(String[] args) {
        int i = 1700;

        if(MyUtils.isLeapYear(i)) {
            System.out.println(i + "년은 윤년입니다.");
        } else {
            System.out.println(i + "년은 윤년이 아닙니다.");
        }
    }
}
