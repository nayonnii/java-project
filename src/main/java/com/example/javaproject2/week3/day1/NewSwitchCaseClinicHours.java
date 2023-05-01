package com.example.javaproject2.week3.day1;

public class NewSwitchCaseClinicHours {
    public static void main(String[] args) {
        String day = "고";
        String time = "휴진";
        switch(day) {
            case "월", "화", "목", "금" -> time = "09:30 - 18:30";
            case "토" ->  time = "09:30-13:00";
            case "수", "일" ->  time = "휴진";
            default -> throw new IllegalArgumentException(day + "는 잘못된 요일입니다.");
        }
        System.out.printf("%s요일은 %s입니다.\n", day, time);
    }
}
