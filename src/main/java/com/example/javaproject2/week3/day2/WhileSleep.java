package com.example.javaproject2.week3.day2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class WhileSleep {
    public static void main(String[] args) throws InterruptedException {
        int cnt = 0;
        while(true){
            System.out.println(LocalDateTime.now());
            Thread.sleep(1000);
        }
    }
}
