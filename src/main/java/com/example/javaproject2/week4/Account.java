package com.example.javaproject2.week4;

public class Account {
    int balance = 1000;
    public void printIsSufficient() {
        System.out.printf("고객님의 잔액은 %d원입니다.\n", balance);
    }

    public boolean isSufficient() {
        return balance >= 1500;
    }
}
