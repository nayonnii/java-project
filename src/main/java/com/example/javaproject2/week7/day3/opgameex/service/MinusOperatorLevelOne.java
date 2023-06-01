package com.example.javaproject2.week7.day3.opgameex.service;

public class MinusOperatorLevelOne implements IOperator{

    int a, b;   // 테스트용 메소드 고정값

    /* 피연산자 a 생성 메소드(고정값_테스트용) */
    @Override
    public void setA(int a) {
        this.a = a;
    }

    /* 피연산자 b 생성 메소드(고정값_테스트용) */
    @Override
    public void setB(int b) {
        this.b = b;
    }

    /* 피연산자 생성 메소드(랜덤값_상용 서비스용) */
    @Override
    public void generateQuestion(int max) {     // 0 <= a - b <= max
        a = (int) (Math.random() * max);
        b = (int) (Math.random() * a);
    }

    /* 문제 생성 메소드 */
    @Override
    public String getQuestionMsg() {
        return String.format("%d - %d = ", a, b);
    }

    /* 정답 체크 메소드 */
    @Override
    public boolean isEquals(int answer) {
        return (a - b == answer);
    }
}
