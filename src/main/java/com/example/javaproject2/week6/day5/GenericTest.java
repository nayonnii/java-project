package com.example.javaproject2.week6.day5;

public class GenericTest<T> {
        private T item;

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
    }

    public static void main(String[] args) {
        GenericTest <Integer> intBox = new GenericTest<>();
        intBox.setItem(10);
        int value = intBox.getItem();  // 형변환 없이 정수로 사용 가능
        System.out.println(value);
    }
}
