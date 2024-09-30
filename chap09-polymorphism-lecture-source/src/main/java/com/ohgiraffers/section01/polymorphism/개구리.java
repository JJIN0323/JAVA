package com.ohgiraffers.section01.polymorphism;

public class 개구리 extends 동물 {

    // Ctrl + O : 오버라이드 단축키.
    @Override
    public void 먹기() {
        System.out.println("개구리가 햄버거를 먹습니다.");
    }

    @Override
    public void 뛰기() {
        System.out.println("개구리가 뛰어갑니다.");
    }

    @Override
    public void 자기() {
        System.out.println("개구리가 잠을 잡니다.");
    }

    /* 필기.
    *   자식은 부모의 메서드 재정의 뿐 아니라 본인의 기능도 가질 수 있다. */
    public void 몰라() {
        System.out.println("개구리가 몰라 합니다.");
    }
}
