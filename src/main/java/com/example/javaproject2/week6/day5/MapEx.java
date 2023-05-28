package com.example.javaproject2.week6.day5;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 80);
        scores.put("Bob", 90);
        scores.put("Charlie", 75);

        System.out.println(scores.get("Bob"));
        System.out.println(scores.containsKey("Charlie"));  // "Charlie"키를 가진 항목이 Map에 존재하는지 확인
        scores.remove("Alice");
        System.out.println(scores);
    }
}
