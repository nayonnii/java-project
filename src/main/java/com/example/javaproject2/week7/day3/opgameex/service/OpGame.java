package com.example.javaproject2.week7.day3.opgameex.service;

public class OpGame {
    int remainingAnswers;   // 남은 기회
    String cheeringUpMsg = "한 번 더 해보자"; // 정답이 아닐 경우_격려 메시지
    IOperator op;

    public OpGame(IOperator op) {
        this.op = op;
    }

    /* 피연산자 생성 메소드(고정값_테스트용) */
    public void makeQuestion() {
        remainingAnswers = 3; // 남은 기회: default 3번
        op.setA(1); // a에 고정값(1) 저장
        op.setB(1); // b에 고정값(1) 저장
    }

    /* 피연산자 생성 메소드(랜덤값_상용 서비스용) */
    public void makeQuestion(int max) {
        op.generateQuestion(max);
    }

    /* 문제 생성 메소드 */
    public String getQuestion() {
        return op.getQuestionMsg();
    }

    /* 정답 체크 메소드 */
    public boolean isAnswer(int answer) {
        remainingAnswers--; // 기회 1씩 차감
        return op.isEquals(answer);
    }

    /* 정답 x_격려 메시지 반환 메소드 */
    public String getCheeringUpMsg() {
        return cheeringUpMsg;
    }

    /* 남은 기회 반환 메소드 */
    public int getRemainingAnswers() {
        return remainingAnswers;
    }
}
