package com.example.javaproject2.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add("Hello");
        l1.add(1);
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.size());      // List의 크기(길이)
        System.out.println(l1.isEmpty());   // 비어있는지 T/F 체크
        l1.remove(0);                 // 해당 index의 값 삭제
        System.out.println(l1.get(0));      // 0번째 값이 삭제됬으므로 기존 1번째 값이 0번째가 되어 출력

        System.out.println("-----------------");

        //for each : for문 대신 for each를 많이 씀
        for(var item : l1) {
            System.out.println(item);
        }
    }
}
