package com.example.javaproject2.week2.day5;

public class SwitchCaseClinicHours2 {
    public static void main(String[] args) {
        String day = "수";
        String time = "";

        switch(day){
            case "월", "화", "목", "금" :
                time = "오전 8:30 ~ 오후 6:30";
                break;
            case "수", "토":
                time = "오전 8:30 ~ 오후 1:00";
                break;
            case "일" :
                time = "휴무일";
                break;
        }
        System.out.printf("%s요일은 %s입니다.\n", day, time);
    }
}
