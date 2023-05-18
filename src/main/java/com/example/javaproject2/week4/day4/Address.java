package com.example.javaproject2.week4.day4;

public class Address {
    private String fullAddr;
    private String sido;    //시,도
    private String sigungu;

    public Address(String fullAddr, String sido, String sigungu) {
        this.fullAddr = fullAddr;
        this.sido = sido;
        this.sigungu = sigungu;
    }

    // 파싱한 결과를 알고 싶을 때 getter 추가 필요
    public String getFullAddr() {
        return fullAddr;
    }

    public String getSido() {
        return sido;
    }

    public String getSigungu() {
        return sigungu;
    }
}
