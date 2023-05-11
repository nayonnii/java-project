package com.example.javaproject2.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class NewListUser {
    public static void main(String[] args) {
        List<NewUser> users = new ArrayList();

        NewUser user1 = new NewUser("박성한", "010-1234-0202");
        users.add(user1);

        NewUser user2 = new NewUser("최지훈", "010-1234-5454");
        users.add(user2);

        NewUser user3 = new NewUser("서진용", "010-1234-2222");
        users.add(user3);

        for(NewUser user : users) {
            System.out.printf("%s님의 전화번호는 %s입니다.\n", user.getName(), user.getPhone());
        }

    }
}
