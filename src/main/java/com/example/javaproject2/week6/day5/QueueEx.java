package com.example.javaproject2.week6.day5;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println(queue.poll());   // queue의 맨 앞에 있는 요소를 반환하고 제거
        System.out.println(queue.peek());   // 큐의 맨 앞에 있는 요소를 반환(확인용)
        System.out.println(queue.size());
    }
}
