package com.example.javaproject2.week7.day3.opgameex.test;

import com.example.javaproject2.week7.day3.opgameex.service.PlusOperatorLevelOne;
import com.example.javaproject2.week7.day3.opgameex.service.OpGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
 * @autor nayeon
 *
 * 1. 덧셈, 뺄셈
 * 2. 기회 3회
 * 3. 격려
 * 4. 결과는 10 미만
 *
 */
public class GameTest {

    /* 피연산자 고정값_테스트 */
    @Test
    public void test() {
        OpGame game = new OpGame(new PlusOperatorLevelOne());
        game.makeQuestion();    // 피연산자 생성
        String question = game.getQuestion(); // 문제 생성

        assertEquals("1 + 1 = ", question);             // 문제 생성 체크
        assertEquals(3, game.getRemainingAnswers());    // 남은 기회가 3번인지 체크
        assertEquals(false, game.isAnswer(3));          // 1 + 1의 값을 3으로 지정하여 false값이 도출되는지 체크
        assertEquals(2, game.getRemainingAnswers());    // 남은 기회가 2번인지 체크
        assertEquals("한 번 더 해보자", game.getCheeringUpMsg());     // 격려메시지 반환 체크
        assertEquals(true, game.isAnswer(2));           // 1 + 1의 값을 2로 지정하여 true값이 도출되는지 체크
    }

    @Test
    public void testRandom() {
        System.out.println((int)(Math.random() * 10));
    }

    @Test
    public void testSumMax() {
        int max = 10;
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * (10 - a));
//        System.out.printf("%d + %d = %d", a, b, a + b); // a, b값 확인용 출력문
        assertTrue(a + b < 10);
    }

    @Test
    public void testMinusMax() {
        int max = 10;
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * a);
//        System.out.printf("%d - %d = %d", a, b, a - b); // a, b값 확인용 출력문
        assertTrue(a - b >= 0);
    }
}
