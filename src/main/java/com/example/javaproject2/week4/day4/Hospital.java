package com.example.javaproject2.week4.day4;

public class Hospital {
    //병원 이름, 주소, 전화번호
    private String name;
    private String websiteAddr;
    private Address address;
    /* address 같은 경우, 시도코드, 시군구코드 등을 같이 넣으면
    나중에 어떤 구가 있는지 찾기 편함.
    따라서 Address라는 class를 별도로 분리하여 관리해줌
    */

    public Hospital(String name, String websiteAddr, Address address) {
        this.name = name;
        this.websiteAddr = websiteAddr;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getWebsiteAddr() {
        return websiteAddr;
    }

    public Address getAddress() {
        return address;
    }
}
