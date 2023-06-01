package com.example.javaproject2.week7.day3.opgame.test;

import com.example.javaproject2.week7.day3.opgame.service.OpGame;
import com.example.javaproject2.week7.day3.opgame.service.PlusOperatorLevelOne;
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
    @Test
    public void test() {
        OpGame game = new OpGame(new PlusOperatorLevelOne());
        game.makeQuestion();    // 문제 출제
        String qusetion = game.getQuestion();
;
        assertEquals("1 + 1 = ", qusetion);
        assertEquals(3, game.getRemainingAnswers()); // 남은 기회
        assertEquals(false, game.isAnswer(3));  // 1+1의 답이 3이 나올 꺼라고 가정(false)
        assertEquals(2, game.getRemainingAnswers());
        assertEquals("한 번 더 해보자", game.getCheeringUpMsg());
        assertEquals(true, game.isAnswer(2));  // 1+1의 답이 2이 나올 꺼라고 가정(true)
    }

    @Test
    public void testRandom() {
        System.out.println((int)(Math.random() * 10));
    }

    @Test
    public void testSumMax() {  // 절대 a + b >= 10인 결과는 나오지 않음
            int max = 10;
            int a = (int) (Math.random() * max);
            int b = (int) (Math.random() * (max - a));
            System.out.printf("%d + %d = %d", a, b, a + b);
            assertTrue(a + b < 10);
    }

    // 마이너스 기능 테스트
    @Test
    public void testMunus() {
        int max = 10;
//        int a = 0;
//        int b = 0;

        /* 방법1)
        int a = (int) (Math.random() * max);
        int b = (int) (Math.random() * a);
        */

        /* 방법2) 자리 바꾸기 */
        int a = (int) (Math.random() * max);
        int b = (int) (Math.random() * (max - a));

        if(a < b) {
            int tmp = b;
            a = b;
            b = tmp;
        }


        System.out.printf("%d - %d = %d", a, b, a - b);
        assertTrue(a - b >= 0);
    }

}
