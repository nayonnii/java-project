package com.example.javaproject2.week7.day1;

public class MyUtils {
    private static void game369Ex() {
        int cnt = 333;
        String result = is369(cnt);
        System.out.println(cnt + result);
    }

    public static void game369() {
        for (int cnt = 0; cnt < 100; cnt++) {
            System.out.print(cnt + "");
            int a = cnt / 10;   // 10의자리수
            int b = cnt % 10;   // 1의자리수

            if (a % 3 == 0 && a != 0) {    // 10의자리수가 3이면 *이 찍힘
                System.out.print("*");
            }
            if (b % 3 == 0 && b != 0) {    // 1의자리수가 3이면 *이 찍힘
                System.out.print("*");
            }
            System.out.println();    // 실제 테스트 할 땐 이 소스는 빼야함(메모리 많이 잡아먹음)
        }
    }

    public static String is369(int cnt) {
        int a = cnt / 10;   // 10의자리수
        int b = cnt % 10;   // 1의자리수
        String str = (b % 3 == 0 && b != 0) ? "*" : "";    // 라인 옮기기 : ctrl + shift

        if (a == 0)     // 10의자리수가 3이면 *이 찍힘
            return str;
        return str + is369(a);
    }

    public static boolean checkLeapYear(int year) {
        /* 윤년 알아맞추기
         * 4로 나누어 떨어지면 윤년, 단, 100년 단위론 윤년이 아님, 근데 400년 단위론 윤년임
         */
//        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//            return true;
//        } else {
//            return false;        }
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static boolean isLeapYear(int year) {
        if(year % 400 == 0) return true;
        if(year % 100 == 0) return false;
        if(year % 4 == 0) return true;
        return true;
    }
}
