package com.example.javaproject2.week1;

import java.util.Scanner;

public class ScannerEx2 {
    void PlusTwoNum() {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("두 개의 숫자를 입력하세요.(첫번째 숫자 입력 후 엔터, 두번째 숫자 입력 후 엔터");
//        System.out.println(scanner.nextInt()+scanner.nextInt());
        System.out.print("첫번째 숫자: ");
        System.out.println("첫번째 숫자는 " + scanner.nextInt() + "입니다.");
        System.out.print("두번째 숫자: ");
        System.out.println("두번째 숫자는 " + scanner.nextInt() + "입니다.");
    }
}
