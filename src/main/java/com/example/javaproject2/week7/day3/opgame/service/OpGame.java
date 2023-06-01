package com.example.javaproject2.week7.day3.opgame.service;

import java.util.Random;

public class OpGame {
    int remainingAnswers;
//    int a, b;
    String cheeringUpMsg = "한 번 더 해보자";
    IOperator op;

    public OpGame(IOperator op) {
        this.op = op;
    }

    // 고정값으로 테스트
    public void makeQuestion() {
        remainingAnswers = 3;   // 기회 횟수
//        a = 1;
//        b = 1;
        op.setA(1);
        op.setB(1);
    }

    // 랜덤값으로 테스트(상용서비스)
    public void makeQuestion(int max) {
//        a = (int)(Math.random() * max);
//        b = (int)(Math.random() * (max - a));
        op.generateQuetion(max);
    }

    //문제 출제
    public String getQuestion() {
        return op.getQuestionMsg();
//        return String.format("%d + %d = ", a, b);
    }

    public int getRemainingAnswers() {
        return remainingAnswers;
    }

    public boolean isAnswer(int answer) {
        remainingAnswers--;
        return op.isEquals(answer);
//        return (a + b) == answer;
    }

    public String getCheeringUpMsg() {
        return cheeringUpMsg;
    }
}
