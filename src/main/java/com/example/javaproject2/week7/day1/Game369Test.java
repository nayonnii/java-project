package com.example.javaproject2.week7.day1;

import static org.junit.jupiter.api.Assertions.*;

class Game369Test {
    @org.junit.jupiter.api.Test
    void testis369() {
        assertEquals("*",MyUtils.is369(3));
        assertEquals("",MyUtils.is369(15));
        assertEquals("**",MyUtils.is369(33));
    }
}