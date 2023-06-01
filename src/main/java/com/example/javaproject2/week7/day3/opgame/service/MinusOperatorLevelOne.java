package com.example.javaproject2.week7.day3.opgame.service;

public class MinusOperatorLevelOne implements IOperator {

    int a, b;

    @Override
    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void generateQuetion(int max) {  // a - b >= 0 이 되도록 세팅
        int a = (int) (Math.random() * max);
        int b = (int) (Math.random() * (max - a));

        if(a < b) {
            int tmp = b;
            a = b;
            b = tmp;
        }
    }

    @Override
    public String getQuestionMsg() {
        return String.format("%d - %d = ", a, b);
    }

    @Override
    public boolean isEquals(int answer) {
        return (a - b) == answer;
    }
}
