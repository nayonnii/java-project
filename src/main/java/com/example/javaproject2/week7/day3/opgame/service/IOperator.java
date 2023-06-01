package com.example.javaproject2.week7.day3.opgame.service;

public interface IOperator {

    /* 피연산자 a 생성 메소드(고정값_테스트용) */
    void setA(int a);

    /* 피연산자 b 생성 메소드(고정값_테스트용) */
    void setB(int b);

    /* 피연산자 생성 메소드(랜덤값_상용 서비스용) */
    void generateQuetion(int max);


    /* 문제 생성 메소드 */
    String getQuestionMsg();

    /* 정답 체크 메소드 */
    boolean isEquals(int answer);
}
