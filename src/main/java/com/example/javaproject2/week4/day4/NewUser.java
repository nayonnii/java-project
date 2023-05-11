package com.example.javaproject2.week4.day4;

public class NewUser {
    //user의 변수는 대체로 private으로 선언하므로 값을 할당할 때 constructor를 이용함
    private String name;
    private String phone;
    private String id;
    private String password;
    private int age;

    boolean isAdult() {
        return age >= 18;
    }

    //constructor
    public NewUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public NewUser(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    //getter
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /* 민감정보인 password는 getter, setter를 잘 만들지 않지만
    만든다면 아래와 같은 로직을 거치게 하여 데이터를 보호함 */
    public String getPassword() {
        // --> 접근제어 로직
        return password;
    }

    public void setPassword(String password) {
        // --> 본인 확인 로직
        this.password = password;
    }
}
