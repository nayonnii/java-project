package com.example.javaproject2.week7.day1;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {
    // 비교연산자 있는 버전
    @org.junit.jupiter.api.Test
    void checkLeapYear() {
        assertEquals(false,MyUtils.checkLeapYear(1700));
    }

    // 비교연산자 없는 버전
    @org.junit.jupiter.api.Test
    void isLearYear() {
        assertEquals(true, MyUtils.isLeapYear(2020));
    }
}