package com.ohgiraffers.section01.polymorphism;

public class 코뿔소 extends 동물{

    @Override
    public void 먹기() {
        System.out.println("코뿔소가 물을 마십니다.");
    }

    @Override
    public void 뛰기() {
        System.out.println("코뿔소가 뛰어갑니다.");
    }

    @Override
    public void 자기() {
        System.out.println("코불소가 잠을 잡니다.");
    }

    public void 갸우뚱() {
        System.out.println("코뿔소가 갸우뚱 합니다.");
    }
}
