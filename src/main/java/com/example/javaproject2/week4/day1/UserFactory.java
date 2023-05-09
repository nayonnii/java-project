package com.example.javaproject2.week4.day1;

public class UserFactory {
    public User getAdultUser() {    // 반환타입이 객체가 될 수도 있음
        User user = new User();
        user.age = 34;
        return user;
    }
}
