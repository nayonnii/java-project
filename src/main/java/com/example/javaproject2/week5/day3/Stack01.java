package com.example.javaproject2.week5.day3;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;

public class Stack01 {
     /*
     push() : 스택(맨 위)에 넣는 기능
     pop() : 스택(맨 위)에서 꺼내고 없애는 기능
     peek() : 스택 맨 위의 값을 확인하는 기능
     empty() : 스택이 비었는지 확인하는 기능
     */
    private int[] arr = new int[10000]; // stack의 메모리(높이)를 미리 할당
    private int pointer = 0;

//    public Stack01(int size) {
//       this.arr = new int[size];
//    }

    public void push(int value) {
        this.arr[pointer++] = value;    // 값을 넣고 포인터를 하나 올려줘야 함
        System.out.println(Arrays.toString(arr));
        System.out.println("pointer = " + pointer); //단축키: soutv
    }

    public int pop() {
        if(isEmpty()) throw new EmptyStackException();  // Exception은 다른 거 넣어도 됨
        int temp = this.arr[pointer - 1];
        pointer--;
        return temp;
//         return this.arr[--pointer]; // 한 줄로 처리 가능
    }

    public int peek() {
        if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");  // Exception은 다른 거 넣어도 됨
        return this.arr[pointer - 1];   // -1을 하지 않으면 pointer가 0이 나와서 -1을 해줘야 함
    }

    public boolean isEmpty() {
        return this.pointer== 0;   //true면 비어있음, false면 비어있지 않음
    }

    public static void main(String[] args) {
        Stack01 st = new Stack01();
        st.push(10);
        st.push(20);
        System.out.println(st.pop());   // arr값은 남아있지만 pointer 값이 바뀌어서 stack 연산이 가능
        System.out.println(st.pop());
//        System.out.println(st.pop());   // EmptyStackException 발생(Exception은 내가 설정한 것)
        System.out.println(st.peek());   // RunTimeException 발생(Exception은 내가 설정한 것)
        System.out.println(st.isEmpty());
    }
}
